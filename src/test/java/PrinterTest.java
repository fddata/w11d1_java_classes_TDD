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

}
