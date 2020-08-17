package ChoreExample;

public class Factory {
    public static IPerson createPerson() {
        return new Person();
    }

    public static IChore createChore() {
        return new Chore();
    }

    public static IMessager createMessager() {
        return new Emailer();
    }

    public static ILogger createLogger() {
        return new Logger();
    }
}
