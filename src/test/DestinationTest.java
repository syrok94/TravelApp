package test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import packages.Activity;
import packages.Destination;

public class DestinationTest {
    Destination destination = new Destination("Kullu");
    Activity activity = new Activity("Skating" , "enjoy skaing in slopes of mountain" , 1000 , 5 , destination);


    @Test
    void testAddActivity(){
        
        destination.addActivity(activity);

        assertTrue(destination.getActivities().contains(activity));
    }


    @Test
    void testGetActivity(){
        destination.addActivity(activity);
        assertEquals(activity , destination.getActivities().get(0));
    }

    @Test
    void testGetName(){
        assertEquals(destination.getName(), "Kullu");
    }
}
