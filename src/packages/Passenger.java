package packages;

import java.util.*;

public class Passenger {
    public String name;
    public int passengerNumber;
    public String passengerType;
    public int balance;
    public List<Activity> activities;

    public Passenger(String name, int passengerNumber, String passengerType, int balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    public boolean signUpForActivity(Activity activity) {
        if (passengerType == "STANDARD") {
            if (balance >= activity.getCost()) {
                balance -= activity.getCost();
                activities.add(activity);
                return activity.addPassenger(this);
            }
            return false;
        } else if (passengerType =="GOLD") {
            double discountedCost = activity.getCost() - activity.getCost() * 0.1;
            if (balance >= discountedCost) {
                balance -= discountedCost;
                activities.add(activity);
                return activity.addPassenger(this);
            }
            return false;
        } else { // PREMIUM passenger
            activities.add(activity);
            return activity.addPassenger(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public String getPassengerType(){
        return passengerType;
    }

    public double getBalance() {
        return balance;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}

