package PrinterExample;

public class OldFashionedPrinter implements Printer {
    @Override
    public void print(Document d) {
        System.out.println("OldFashionedPrinter");
        System.out.println(d.getName() + ": " + d.getText());
    }
}
