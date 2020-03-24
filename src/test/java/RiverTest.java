import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    River river;
    Salmon salmon;

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon("Roosa");
    }

    @Test
    public void riverStartsEmpty(){
        assertEquals(0, river.fishCount());
    }

    @Test
    public void canAddSalmon(){
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canDeactivateSalmon(){
        river.addFish(salmon);
        Salmon salmon2 = new Salmon("Noel");
        river.addFish(salmon2);
        river.deactivateSalmon(salmon);
        assertEquals(1, river.fishCount());
    }
}
