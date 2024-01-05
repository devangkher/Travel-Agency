/**
 * A standard passenger has a balance. And each time a standard passenger signs up for an activity the cost is deducted from their balance.
 * They cannot sign up for an activity if they do not have sufficient balance.
 */

class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    public boolean signUpForActivity(Activity activity) {
        if (activity.addPassenger(this)) {
            this.balance -= activity.getCost();
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}

