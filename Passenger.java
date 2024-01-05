import java.util.*;

/**
 * Passenger class interacts with ACTIVITY class and DESTINATION class.
 * StandardPassenger, GoldPassenger, PremiumPassenger are its child classes
 */
class Passenger {
    private String name;
    private int number;
    private Map<Activity, Double> activitiesSigned;

    public Passenger(String name, int number) {
        this.name = name;
        this.number = number;
        activitiesSigned = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return number;
    }

    public Map<Activity, Double> getActivities() {
        return this.activitiesSigned;
    }
}