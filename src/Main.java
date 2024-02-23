

import packages.TravelPackage;
import packages.Activity;
import packages.Destination;
import packages.Passenger;

public class Main {
    public static void main(String[] args) {
        
        TravelPackage ManaliPackage = new TravelPackage("Adventure trip Manali" , 20);

        // creating destination to the travel package
        Destination destination1= new Destination("Solang Valley");
        Destination destination2= new Destination("Rohtang Valley");
        Destination destination3= new Destination("MAll Road");

        // Add destinations to the travel package
        ManaliPackage.addDestination(destination1);
        ManaliPackage.addDestination(destination2);
        ManaliPackage.addDestination(destination3);

        
        // Adding activity for destination 1
        Activity A1 = new Activity("Paragliding", "Enjoy paragliding in the mountains", 1750, 5,destination1);
        Activity A2 = new Activity("Trek", "Enjoy Treking in the mountains", 750, 3,destination1);
        Activity A3 = new Activity("skating", "Enjoy skating in the mountains", 350, 4,destination1);
        
        destination1.addActivity(A1);
        destination1.addActivity(A2);
        destination1.addActivity(A3);

         // Adding activity for destination 2
         Activity B1 = new Activity("Paragliding", "Enjoy paragliding in the mountains", 1750, 5,destination2);
         Activity B2 = new Activity("Trek", "Enjoy Treking in the mountains", 750, 3,destination2);
         Activity B3 = new Activity("skating", "Enjoy skating in the mountains", 350, 4,destination2);
         
         destination2.addActivity(B1);
         destination2.addActivity(B2);
         destination2.addActivity(B3);
        
          // Adding activity for destination 3
        Activity C1 = new Activity("Shopping", "Enjoy shopping", 0, 10,destination3);
        Activity C2 = new Activity("Church visit", "visit this holy place", 0, 10,destination3);
        
        
        destination3.addActivity(C1);
        destination3.addActivity(C2);
        

        // // Create passengers
        Passenger p1 = new Passenger("Ram" , 1, "STANDARD" , 23884);
        Passenger p2 = new Passenger("Mohan" , 2, "PREMIUM" , 10888);
        Passenger p3 = new Passenger("Rakesh" , 3, "STANDARD" , 188800);
        Passenger p4 = new Passenger("Rohit" , 4, "GOLD" , 508888);

        //add passenger to trip
        ManaliPackage.addPassenger(p1);
        ManaliPackage.addPassenger(p2);
        ManaliPackage.addPassenger(p3);
        ManaliPackage.addPassenger(p4);

        // Sign up passengers for activities
        p1.signUpForActivity(A2);
        p1.signUpForActivity(A1);
        p1.signUpForActivity(B2);
        p1.signUpForActivity(C1);
        p2.signUpForActivity(A2);
        p3.signUpForActivity(A1);
        p4.signUpForActivity(B2);
        p2.signUpForActivity(C1);

        

        //print Itinerary 
        // ManaliPackage.printItinerary();

        //get package info
        // ManaliPackage.printPackageInfo();

        // Print passengers details
        // ManaliPackage.passengerDetails();

        // get all space
        ManaliPackage.activitiesAvailable();
        
    }
}
