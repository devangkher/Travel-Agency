import java.util.*;
class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private List<Passenger> passengers;
    public Destination assignedDestination;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSpaces() {
        return capacity - passengers.size();
    }

    @Override
    public String toString() {
        return "Activity: " + name + ", Description: " + description + ", Cost: " + cost +
                ", Capacity: " + capacity + ", Available Spaces: " + getAvailableSpaces();
    }

    public double getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    public Destination getDestination() {
        return this.assignedDestination;
    }
}
