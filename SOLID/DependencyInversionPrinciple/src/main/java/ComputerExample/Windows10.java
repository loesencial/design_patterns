package ComputerExample;

public class Windows10 {
    private IKeyboard keyboard;
    private IMonitor monitor;

    /**
     * By instantiating new objects in the Windows10 constructor we have tightly coupled this keyboard and monitor with Windows10
     * This violates the Dependency Inversion Principle
     */
    public Windows10() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new Monitor();
    }

    /**
     * By extracting out the IKeyboard and IMonitor interfaces, we decouple the keyboard and monitor implementations from Windows10
     * Further, not instantiating the classes in the constructor ensures we can easily swap out the keyboard/monitor instances being passed into Windows10
     */
    public Windows10(IKeyboard keyboard, IMonitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
