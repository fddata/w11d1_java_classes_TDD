public class Printer {
    private int sheetsRemaining;
    private int tonerRemaining;

    public Printer(){
        this.sheetsRemaining = 100;
        this.tonerRemaining = 1000;
    }

    public int getSheetsRemaining() {
        return this.sheetsRemaining;
    }

    public  void print(int numberOfSheets, int numberOfCopies) {
        int sheetsRequired = numberOfSheets * numberOfCopies;
       if (this.sheetsRemaining >= sheetsRequired && this.tonerRemaining >= sheetsRequired){
           this.sheetsRemaining -= sheetsRequired;
           this.tonerRemaining -= sheetsRequired;
       }
    }

    public void refill(int sheetsAdded) {
        this.sheetsRemaining += sheetsAdded;
    }


    public int getTonerRemaining() {
        return tonerRemaining;
    }
}
