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
        int result = printer.getSheets();
        assertEquals(100, result);
    }

    @Test
    public void canPrintTrue(){
        printer.print(30, 3);
        int remainingSheets = printer.getSheets();
        assertEquals(10, remainingSheets);
    }

    @Test
    public void canPrintFalse(){
        printer.print(30,4);
        int remainingSheets = printer.getSheets();
        assertEquals(100,100);
    }

}
