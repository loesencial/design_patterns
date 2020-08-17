package RelationshipsExample;

import lombok.Getter;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser { // low-level class, because it deals with data storage
    @Getter
    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person person, Person child) {
        relations.add(new Triplet<>(person, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, person));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return this.relations.stream().filter(x -> x.getValue0().name.equals(name) && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
