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
        public void canSubtract() {
            int result = calculator.subtract(7, 5);
            assertEquals(2, result);
        }

        @Test
        public void canMultiply(){
        int result = calculator.multiply(7,5);
        assertEquals(35, result);
        }

        @Test
        public void canDivide(){
            int result = calculator.divide(35, 7);
            assertEquals(5, result);
        }
    }

