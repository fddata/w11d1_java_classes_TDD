import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

     Calculator calculator;

        @Before
        public void testSetup(){
            calculator = new Calculator();
        }


        @Test
        public void canAdd(){
        int result = calculator.add(5,7);
        assertEquals(12, result);
        }

        @Test
        public void canSubtract(){
        int result = calculator.subtract(7,5);
        assertEquals(2, result);
    }

}
