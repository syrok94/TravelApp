package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import packages.Activity;
import packages.Destination;
import packages.Passenger;

public class ActivityTest {

    @Test
    void testAddPassenger() {
        Activity activity = new Activity("Trek", "Enjoy Trek in Mountains", 100.0, 5 , new Destination("Solang Valley"));
        Passenger passenger = new Passenger("Ram", 1, "STANDARD", 200);
        assertTrue(activity.addPassenger(passenger));
    }
    
}
