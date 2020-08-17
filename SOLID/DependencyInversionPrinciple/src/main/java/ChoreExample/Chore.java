package ChoreExample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Chore implements IChore {
    private String choreName;
    private IPerson owner;
    private double hoursWorked;
    private boolean isComplete;

    public Chore(String choreName, IPerson owner) {
        this.choreName = choreName;
        this.owner = owner;
    }

    @Override
    public void performWork(double hours) {
        this.hoursWorked = this.hoursWorked + hours;
        ILogger log = new Logger(); //tightly couple dependency with lower level module
        log.log("Performed work on " + this.getChoreName());
    }

    @Override
    public void completeChore() {
        this.isComplete = true;

        //ILogger log = new Logger(); //tightly couple dependency with lower level module
        ILogger log = Factory.createLogger();
        log.log("Completed " + this.getChoreName());

        //IMessager emailer = new Emailer(); //tightly couple dependency with lower level module
        IMessager emailer = Factory.createMessager();
        emailer.sendMessage(owner, "The chore '" + this.getChoreName() + "' is completed");
    }

}
