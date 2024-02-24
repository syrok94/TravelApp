package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import packages.Destination;
import packages.Passenger;
import packages.TravelPackage;




class TravelPackageTest {

    TravelPackage travelPackage = new TravelPackage("Test Travel Package", 10);
    Destination destination = new Destination("Test Destination");
    Passenger passenger = new Passenger("ram", 4, "STANDARD", 50000);


    @Test
    void testAddDestination() {
        
        travelPackage.addDestination(destination);
        assertTrue(travelPackage.getDestinations().contains(destination));
    }


    @Test
    void testAddPassengers() {
        travelPackage.addPassenger(passenger);
        assertTrue(travelPackage.getPassengers().contains(passenger));
    }

    @Test
    void testGetDestination(){  
        travelPackage.addDestination(destination);
        assertEquals(destination, travelPackage.getDestinations().get(0));
    }   

    @Test
    void testGetPassenger(){
        travelPackage.addPassenger(passenger);
        assertEquals(passenger, travelPackage.getPassengers().get(0));
    }
}