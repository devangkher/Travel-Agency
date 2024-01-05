import java.util.*;

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }


    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    // HERE AVAILABLE ACTIVITIES MEAN ACTIVITIES WHICH ARE NOT SOLD OUT.
    public List<Activity> getAvailableActivities() {
        List<Activity> availableActivities = new ArrayList<>();
        for (Activity activity : activities) {
            if (activity.getAvailableSpaces() > 0) {
                availableActivities.add(activity);
            }
        }
        return availableActivities;
    }

    @Override
    public String toString() {
        return "Destination: " + name;
    }

    public String getName() {
        return this.name;
    }
}
