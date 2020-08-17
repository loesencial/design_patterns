package Product;

import java.util.List;

public class AndSpecification<T> implements Specification<T> {

    private List<Specification<T>> specs;

    public AndSpecification(List<Specification<T>> specs) {
        this.specs = specs;
    }

    @Override
    public boolean isSatisfied(T item) {
        for(Specification<T> spec: specs)
            if(!spec.isSatisfied(item)) return false;
        return true;
    }
}
