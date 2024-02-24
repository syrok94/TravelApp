package test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import packages.Activity;
import packages.Destination;

public class DestinationTest {

    @Test
    void testAddDestination(){
        String name = "Rohtang";
        Destination destination = new Destination(name);
        assertEquals(destination.getName() , name);
    }

    @Test
    void testAddActivity(){
        Destination destination = new Destination("Kullu");
        Activity activity = new Activity("Skating" , "enjoy skaing in slopes of mountain" , 1000 , 5 , destination);
        destination.addActivity(activity);

        assertTrue(destination.getActivities().contains(activity));
    }
}
