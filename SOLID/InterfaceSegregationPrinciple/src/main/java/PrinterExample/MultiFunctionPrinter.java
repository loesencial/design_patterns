package PrinterExample;

public class MultiFunctionPrinter implements MultiFunctionMachine {
    @Override
    public void print(Document d) {
        System.out.println("MultiFunctionPrinter");
        System.out.println(d.getName() + ": " + d.getText());
    }

    @Override
    public void fax(Document d) {
        System.out.println("Faxing document");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanning document");
    }
}
