import org.junit.Before;
import org.junit.Test;

import Staff.CabinCrewMember;
import Staff.Rank;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {
    private CabinCrewMember crewMember;

    @Before
    public void before() {
        crewMember = new CabinCrewMember("Alice", Rank.PURSER);
    }

    @Test
    public void testCabinCrewMemberHasName() {
        assertEquals("Alice", crewMember.getName());
    }

    @Test
    public void testCabinCrewMemberHasRank() {
        assertEquals(Rank.PURSER, crewMember.getRank());
    }

    @Test
    public void testCabinCrewMemberCanRelayMessage()
    {
        assertEquals("Strap in lads", crewMember.relayMessage("Strap in lads"));
    }
}
