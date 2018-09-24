public class Printer {
    private int numberOfSheetsRemaining;

    public Printer(){
        this.numberOfSheetsRemaining = 100;
    }

    public int getSheets() {
        return this.numberOfSheetsRemaining;
    }
}
