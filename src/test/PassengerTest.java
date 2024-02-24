package test;

import org.junit.jupiter.api.Test;

import packages.Activity;
import packages.Destination;
import packages.Passenger;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test

    void testSignupForActivity(){
        Destination destination = new Destination("Kullu");
        Passenger passenger = new Passenger("ram", 0, "GOLD", 15634);
        Activity activity = new Activity("treking", "Enjoy treking in the mountains", 500, 10, destination);
        assertTrue(passenger.signUpForActivity(activity));
    }
}
