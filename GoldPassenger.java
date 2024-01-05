/**
 * A gold passenger has a balance. Each time a gold passenger signs up for an activity,
 * a 10% discount is applied on the cost of the activity and the discounted amount is
 * deducted from their balance. They cannot sign up for an activity if they do not have sufficient balance.
 */

class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    public boolean signUpForActivity(Activity activity) {
        if (activity.addPassenger(this)) {
            double discountedCost = activity.getCost() * 0.9;
            this.balance -= discountedCost;
            return true;
        } else {
            return false;
        }
    }
}

