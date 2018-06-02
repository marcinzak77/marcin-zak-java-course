package com.kodilla.good.patterns.challenges.food2door;

public class WireTransferPayments implements Payments {

    double amount;
    boolean confirmation;

    public WireTransferPayments(double amount, boolean confirmation) {
        this.amount = amount;
        this.confirmation = confirmation;
    }

    @Override
    public boolean paymentsProcess() {
        if (amount>0 && confirmation) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public boolean getConfirmation() {
        return confirmation;
    }
}
