package packages;

import java.util.*;

public class TravelPackage {
    private String name;
    public int passengerCapacity;
    public List<Destination> itinerary;
    public List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("\nDestination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
            }
        }
    }

    public void printPackageInfo(){
        System.out.println("Travel Package Information : ");
        System.out.println("Package Name : "+this.name);
        System.out.println("Passenger Capacity : " + this.passengerCapacity);
        System.out.println("Total passenger enrolled : " + this.passengers.size());
        System.out.println("Name and Id of each Passenger : ");

        for(Passenger passenger : this.passengers){
            System.out.println("Name : " + passenger.name + " :: ID : " + passenger.passengerNumber);
        }
    }

    public void passengerDetails(){
        System.out.println("\nList of Passengers: ");
        for(Passenger passenger : passengers){
            System.out.println("Name : " + passenger.name);
            System.out.println("Number : " + passenger.passengerNumber);
            System.out.println("Balance : " + passenger.balance);

            System.out.println("Activities they have signed for : ");
            for(Activity activty : passenger.activities){
                System.out.println(activty.getName());
            }
        }
    }


    public void activitiesAvailable(){
        int sum = 0;
       for(Destination D : itinerary){

            for(Activity A : D.activities){
                if(A.passengers.size() < A.getCapacity()){
                    sum+=A.getCapacity() - A.passengers.size();
                    System.out.println(A.getName() + " ");
                }
            }
       }

       System.out.println("Total space available : " + sum);
    }
}