import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;
    Salmon salmon2;
    River river;

    @Before
    public void before(){
        bear = new Bear("Callum");
        salmon = new Salmon("Roosa");
        salmon2 = new Salmon("Noel");
        river = new River();
        river.addFish(salmon);
        river.addFish(salmon2);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatSalmonFromRiver(river, salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void canSleep(){
        bear.eatSalmonFromRiver(river, salmon);
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }

}
