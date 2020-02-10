import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestWaterBottle {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void bottle_has_volume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink_subtracts_ten_from_bottle(){
        assertEquals(90, waterBottle.drink()); 
    }


}
