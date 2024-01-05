import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Package 1", 50);
        Destination destination = new Destination("Destination 1");

        travelPackage.addDestination(destination);

        assertEquals(1, travelPackage.getDestinations().size());
        assertEquals("Destination 1", travelPackage.getDestinations().get(0).getName());
    }

    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Package 2", 2);
        Passenger passenger1 = new StandardPassenger("Rachael", 1, 500.0);
        Passenger passenger2 = new StandardPassenger("Joey", 2, 800.0);

        assertTrue(travelPackage.addPassenger(passenger1));
        assertTrue(travelPackage.addPassenger(passenger2));
        assertFalse(travelPackage.addPassenger(new StandardPassenger("Monica", 3, 900.0)));
    }


}
