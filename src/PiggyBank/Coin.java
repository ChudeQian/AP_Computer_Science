package PiggyBank;

/**
 * Created by Frank on 2/18/2016.
 */
public abstract class Coin implements Money {
    private double amount;

    public Coin(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
