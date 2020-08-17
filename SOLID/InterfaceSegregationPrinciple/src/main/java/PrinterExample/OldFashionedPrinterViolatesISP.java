package PrinterExample;

public class OldFashionedPrinterViolatesISP implements Machine {
    @Override
    public void print(Document d) {
        System.out.println("OldFashionedPrinter");
        System.out.println(d.getName() + ": " + d.getText());
    }

    @Override
    public void fax(Document d) {
        throw new RuntimeException("Cannot fax");
    }

    @Override
    public void scan(Document d) {
        throw new RuntimeException("Cannot scan");
    }
}
