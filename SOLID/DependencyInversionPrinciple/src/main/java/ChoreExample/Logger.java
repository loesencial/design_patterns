package ChoreExample;

public class Logger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("Write to console: " + message);
    }
}
