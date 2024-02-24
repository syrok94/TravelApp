package test;

import org.junit.jupiter.api.Test;

import packages.Activity;
import packages.Destination;
import packages.Passenger;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    Destination destination = new Destination("Kullu");
    Passenger passenger = new Passenger("ram", 0, "GOLD", 15634);
    Activity activity = new Activity("treking", "Enjoy treking in the mountains", 500, 10, destination);

    @Test
    void testSignupForActivity(){
        assertTrue(passenger.signUpForActivity(activity));
    }

    @Test
    void testGetName(){
        assertEquals(passenger.getName(), "ram");
    }

    @Test
    void testGetPassengerNumber(){
        assertEquals(passenger.getPassengerNumber(), 0);
    }

    @Test
    void testGetPassengerType(){
        assertEquals(passenger.getPassengerType(), "GOLD");
    }

    @Test
    void testGetPassengerBalance(){
        assertEquals(passenger.getBalance(), 15634);
    }


    @Test
    void testGetPassengerACtivity(){
        passenger.signUpForActivity(activity);
        assertEquals(activity , passenger.getActivities().get(0));
    }
    
}
