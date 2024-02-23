package packages;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    public List<Passenger> passengers;
    public Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Destination getDestination() {
        return destination;
    }
}
