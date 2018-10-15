package Johnston19;

import Johnston19.Payment;

/**
 * Created by edwardsb on 11/7/16.
 */
public class Iou implements Payment {
    double amount;

    public Iou(double amount) {
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
