import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void testPlaneHasCapacity() {
        assertEquals(100, plane.getPlaneType().getCapacity());
    }

    @Test
    public void testPlaneHasTotalWeight() {
        assertEquals(500, plane.getPlaneType().getTotal_weight());
    }
}

