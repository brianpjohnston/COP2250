package Johnston19;

import Johnston19.Payment;

/**
 * Created by edwardsb on 11/7/16.
 */
public class Check implements Payment {
    private double amount;

    public Check(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
