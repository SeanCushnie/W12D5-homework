import org.junit.Before;
import org.junit.Test;

import Staff.Pilot;
import Staff.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Derek", Rank.PILOT, "01");
    }

    @Test
    public void testPilotHasName() {
        assertEquals("Derek", pilot.getName());
    }

    @Test
    public void testPilotHasRank() {
        assertEquals(Rank.PILOT, pilot.getRank());
    }

    @Test
    public void testPilotHasLicenseNumber() {
        assertEquals("01", pilot.getLicenseNumber());
    }

    @Test
    public void testPilotCanFlyPlane()
    {
        assertEquals("NNNNEEEEEOOOW! I'm flying the plane, boys", pilot.flyPlane("NNNNEEEEEOOOW! I'm flying the plane, boys"));
    }
}
