import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("John", 2);
    }

    @Test
    public void testPassengerHasName() {
        assertEquals("John", passenger.getName());
    }

    @Test
    public void testPassengerHasNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }
}

