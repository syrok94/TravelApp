package test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import packages.Activity;
import packages.Destination;
import packages.Passenger;

public class ActivityTest {

    Activity activity = new Activity("Trek", "Enjoy Trek in Mountains", 100.0, 5 , new Destination("Solang Valley"));
    Passenger passenger = new Passenger("Ram", 1, "STANDARD", 200);
    

    @Test
    void testAddPassenger() {
        assertTrue(activity.addPassenger(passenger));
    }
    
    @Test
    void testGetName(){
        assertEquals(activity.getName() , "Trek");
    }

    @Test
    void testGetDescription(){
        assertEquals(activity.getDescription() ,"Enjoy Trek in Mountains");
    }

   
    @Test
    void testGetCost(){
        assertEquals(activity.getCost(), 100.0 , 0.00001);
    }

    @Test
    void testGetCapacity(){
        assertEquals(activity.getCapacity() , 5);
    }

    @Test
    void testGetPassenger(){
        activity.addPassenger(passenger);
        assertEquals(activity.getPassengers().get(0), passenger);
    }


    @Test
    void testGetDestination(){
        Destination destination = activity.destination;
        assertEquals(destination.getName(),"Solang Valley");
    }
}
