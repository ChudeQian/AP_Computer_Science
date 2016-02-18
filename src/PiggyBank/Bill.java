package PiggyBank;

/**
 * Created by Frank on 2/18/2016.
 */
public abstract class Bill implements Money {
    private double amount;

    public Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "$" + amount;
    }
}
