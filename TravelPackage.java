import java.util.*;

/**
 *  Passengers and destinations are added in this class. But objects of the same must be created before.
 * Passenger class interacts with Activity class and Destination class.
 */
class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            System.out.println(destination);
            List<Activity> activities = destination.getAvailableActivities();
            for (Activity activity : activities) {
                System.out.println(activity);
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger Name: " + passenger.getName() + ", Passenger Number: " + passenger.getNumber());
        }
    }

    public void printIndividualPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Name: " + passenger.getName() + ", Passenger Number: " + passenger.getNumber());
        //printing balance if the passenger is standard or gold
        if (passenger instanceof StandardPassenger || passenger instanceof GoldPassenger) {
            double balance = ((StandardPassenger) passenger).getBalance();
            System.out.println("Balance: " + balance);
        }
        // printing Destination, Activity and price paid
        Map<Activity, Double> activities = passenger.getActivities();
        for (Map.Entry<Activity, Double> entry : activities.entrySet()) {
            Activity activity = entry.getKey();
            double pricePaid = entry.getValue();
            System.out.println("Activity: " + activity.getName() + ", Destination: " + activity.getDestination().getName() +
                    ", Price Paid: " + pricePaid);
        }
    }

    public void printAvailableActivities() {
        System.out.println("Activities with Available Spaces in Travel Package: " + name);
        for (Destination destination : destinations) {
            List<Activity> activities = destination.getAvailableActivities();
            for (Activity activity : activities) {
                System.out.println(activity);
            }
        }
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
