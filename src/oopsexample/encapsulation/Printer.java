package oopsexample.encapsulation;

public class Printer {

    private int tonerLevel;
    private int printPages;
    private boolean isDuplexPrinter;    //Can print on both sides

    public Printer(int tonerLevel, boolean isDuplexPrinter){
        this.isDuplexPrinter = isDuplexPrinter;
        this.tonerLevel = tonerLevel;
        this.printPages = 0;
    }

    public void fillToner(){
        while(this.tonerLevel > 0 && this.tonerLevel <=100){
            System.out.println("Toner level is....." + this.tonerLevel);
            tonerLevel++;
        }
        System.out.println("Toner is full....");
    }

    public void printPages(int printPages){
        System.out.println("Print " + printPages + " Pages");
        int printCounter = 1;
        if(isDuplexPrinter){
            if(printPages % 2 <= 1){
                this.printPages = (printPages % 2) + (printPages / 2);
            }
        }else{
            this.printPages = printPages;
        }
        while(printCounter <= this.printPages){
            System.out.println("Printing page...." + printCounter);
            printCounter++;
        }
    }
}
