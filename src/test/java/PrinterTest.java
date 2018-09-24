import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void testSetup(){
        printer = new Printer();
    }

    @Test
    public void hasSheets(){
        int result = printer.getSheetsRemaining();
        assertEquals(100, result);
    }

    @Test
    public void canPrintTrue(){
        printer.print(30, 3);
        int remainingSheets = printer.getSheetsRemaining();
        assertEquals(10, remainingSheets);
    }

    @Test
    public void canPrintFalse(){
        printer.print(30,4);
        int remainingSheets = printer.getSheetsRemaining();
        assertEquals(100,remainingSheets);
    }

    @Test
    public void canRefill(){
        printer.print(30,3);
        printer.refill(30);
        int remainingSheets = printer.getSheetsRemaining();
        assertEquals(40, remainingSheets);
    }

    @Test
    public void hasToner(){
        int remainingToner = printer.getTonerRemaining();
        assertEquals(1000, remainingToner);
    }


    @Test
    public void consumeTonerOnPrint(){
        printer.print(25, 2);
        int remainingToner = printer.getTonerRemaining();
        assertEquals(950, remainingToner);
    }
}
