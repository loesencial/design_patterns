package ChoreExample;

public class ChoreDemo {
    public static void main(String[] args) {
        /**
         * The creation of the Person class and the Chore class below are tightly coupled.
         * Similarly inside the Chore class, the creation of the Logger and the Emailer are tightly coupled
         * This violates the Dependency Inversion principle
         */
        Person owner = new Person("Jane", "Doe",
                "janedoe@does.com", "555-6666"); //tightly couple dependency with lower level module
        Chore chore = new Chore("Take out the trash", owner); //tightly couple dependency with lower level module

        chore.performWork(3);
        chore.performWork(1.5);
        chore.completeChore();

        /**
         * One way to fix this would be to extract interfaces out all the classes
         * Similarly rather than create instances/objects where needed, the creation of objects is centralized in a Factory class
         * This would allow us to be not tied down to a single class, for e.g if in the future if we ever need to swap out the Emailer
         * with say the Texter, then it can be easily done without affecting the clients.
         */
        IPerson gardener = Factory.createPerson();
        gardener.setFirstName("John");
        gardener.setFirstName("Doe");
        gardener.setEmailAddress("johndoe@does.com");
        gardener.setPhoneNumber("666-7777");

        IChore task = Factory.createChore();
        task.setChoreName("Mow the lawn");
        task.setOwner(gardener);

        task.performWork(0.5);
        task.performWork(2);
        task.performWork(1);
        task.completeChore();
    }
}
