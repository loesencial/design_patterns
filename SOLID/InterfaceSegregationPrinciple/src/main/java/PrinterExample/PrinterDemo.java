package PrinterExample;

import java.io.PrintStream;

public class PrinterDemo {
    public static void main(String[] args) {
        /**
         * Here we have an uber machine interface that requires methods for print, fax and scan
         * This would be fine with the MultiFunctionPrinter which implements all 3
         * However, it wouldnt work for the OldFashionedPrinter which only implements print.
         * It would still have to provide an implementation for fax and scan which might not be ideal
         */
        Document d = new Document("Test Document", "Aligning the printer");

        System.out.println("Violating ISP");
        Machine multiFunctionPrinterViolatesISP = new MultiFunctionPrinterViolatesISP();
        multiFunctionPrinterViolatesISP.print(d);
        multiFunctionPrinterViolatesISP.fax(d);

        Machine oldFashionedPrinterViolatesISP = new OldFashionedPrinterViolatesISP();
        oldFashionedPrinterViolatesISP.print(d);
        //oldFashionedPrinter.fax(d); // this causes a RuntimeException to be thrown

        /**
         * InterfaceSegregationPrinciple specifies that no client should be forced to implement methods it does not need.
         * One way to follow this principle in this scenario is to narrow the interface to each specific feature
         * Like have an interface each for Printer, Fax, Scanner
         */
        System.out.println();
        System.out.println("Respecting ISP");
        MultiFunctionMachine multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(d);
        multiFunctionPrinter.scan(d);

        Printer oldFashionedPrinter = new OldFashionedPrinter();
        oldFashionedPrinter.print(d); //scan and fax methods do not apply
    }
}
