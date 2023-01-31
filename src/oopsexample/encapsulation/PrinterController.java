package oopsexample.encapsulation;

public class PrinterController {
    public static void main(String[] args) {
        Printer printer = new Printer(95,false);
        Printer nextPrinter = new Printer(98,true);
        printer.fillToner();
        System.out.println("=======Start Printing=========");
        printer.printPages(4);
        System.out.println("=======End Printing=========");
        System.out.println("=======Start Printing=========");
        nextPrinter.printPages(2);
        System.out.println("=======End Printing=========");
        System.out.println("=======Start Printing=========");
        nextPrinter.printPages(3);
        System.out.println("=======End Printing=========");
        System.out.println("=======Start Printing=========");
        nextPrinter.printPages(5);
        System.out.println("=======End Printing=========");
    }
}
