/**
 * A premium passenger can sign up for activities for free.
 */

class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int number) {
        super(name, number);
    }

    public boolean signUpForActivity(Activity activity) {
        return activity.addPassenger(this);
    }
}
