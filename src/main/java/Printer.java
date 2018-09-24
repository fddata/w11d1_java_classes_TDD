public class Printer {
    private int numberOfSheetsRemaining;

    public Printer(){
        this.numberOfSheetsRemaining = 100;
    }

    public int getSheets() {
        return this.numberOfSheetsRemaining;
    }

    public  void print(int numberOfSheets, int numberOfCopies) {
        int sheetsRequired = numberOfSheets * numberOfCopies;
       if (this.numberOfSheetsRemaining >= sheetsRequired){
           this.numberOfSheetsRemaining -= sheetsRequired;
       }
    }
}
