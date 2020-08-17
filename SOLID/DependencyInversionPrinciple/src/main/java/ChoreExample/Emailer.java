package ChoreExample;

public class Emailer implements IMessager {
    @Override
    public void sendMessage(IPerson person, String message) {
        System.out.println("Simulating sending an email to " + person.getEmailAddress());
        System.out.println(message);
    }
}
