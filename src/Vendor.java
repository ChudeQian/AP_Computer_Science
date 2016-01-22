/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions. test
 */
public class Vendor {
    private static double totalSales;
    // Fields:
    private int deposited;
    private int stock;
    private int price;
    private int change;

    /**
     * Constructs a Vendor
     *
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public static double getTotalSales() {
        double sales = totalSales;
        totalSales = 0;
        return sales;
    }

    /**
     * Returns the number of items currently in stock.
     *
     * @return number of items currently in stock (int)
     */
    public int getStock()

    {
        return this.stock;
    }

    /**
     * Sets the quantity of items in stock.
     *
     * @param qty number of items to place in stock (int)
     */
    public void setStock(int qty) {
        this.stock = qty;
    }

    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     *
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int number) {
        deposited += number;
    }

    /**
     * Returns the currently deposited amount (in cents).
     *
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit()

    {
        return deposited;
    }

    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock and
     * calculates and sets change, sets deposit to 0 and
     * returns true; otherwise refunds the whole deposit
     * (moves it into change) and returns false.
     *
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale() {
        if (stock > 0 && deposited >= price) {
            change = deposited - price;
            stock -= 1;
            System.out.println("The stock is:" + stock);

            deposited = 0;
            totalSales += price / 100.0;
            System.out.println();
            return true;
        } else {
            change = deposited;
            deposited = 0;
            return false;
        }
    }

    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     *
     * @return number of cents in the current change (int)
     */
    public int getChange()

    {
        int temp = change;
        change = 0;
        return temp;
    }

}
