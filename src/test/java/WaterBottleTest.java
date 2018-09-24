import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void testSetup(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        int result = waterBottle.getVolume();
        assertEquals(100, result);
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        int result = waterBottle.getVolume();
        assertEquals(90, result);
    }
}
