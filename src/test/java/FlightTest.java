import org.junit.Before;
import org.junit.Test;

import Staff.CabinCrewMember;
import Staff.Pilot;
import Staff.Rank;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void setUp()
    {
        pilots = new ArrayList<>();
        pilots.add(new Pilot("John", Rank.PILOT, "P01"));

        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(new CabinCrewMember("Alice", Rank.PURSER));

        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(pilots, cabinCrewMembers, plane,
                "FR756", "GLA", "EDI", "12:00");

        passenger1 = new Passenger("Boaby", 2);
        passenger2 = new Passenger("Niamh", 55);
        flight.bookPassenger(passenger1);
    }

    @Test
    public void testGetAvailableSeats()
    {
        assertEquals(99, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassenger()
    {
        flight.bookPassenger(passenger2);
        assertEquals(98, flight.getAvailableSeats());
    }

    @Test
    public void testPilots()
    {
        assertEquals(pilots, flight.getPilots());
    }

    @Test
    public void testCabinCrewMembers()
    {
        assertEquals(cabinCrewMembers, flight.getCabinCrewMembers());
    }

    @Test
    public void testFlightNumber()
    {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void testDestination()
    {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void testDepartureAirport()
    {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void testDepartureTime()
    {
        assertEquals("12:00", flight.getDepartureTime());
    }
}

