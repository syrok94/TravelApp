package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import packages.Destination;
import packages.Passenger;
import packages.TravelPackage;




class TravelPackageTest {

    @Test
    void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Test Travel Package", 10);
        Destination destination = new Destination("Test Destination");
        travelPackage.addDestination(destination);
        assertTrue(travelPackage.getDestinations().contains(destination));
    }


    @Test
    void testAddPassengers() {
        TravelPackage travelPackage = new TravelPackage("Test Travel Package", 10);
        Passenger passenger = new Passenger("ram", 4, "STANDARD", 50000);
        travelPackage.addPassenger(passenger);
        assertTrue(travelPackage.getPassengers().contains(passenger));
    }
}