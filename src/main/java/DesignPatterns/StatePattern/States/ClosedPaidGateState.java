package DesignPatterns.StatePattern.States;

public class ClosedPaidGateState implements IPaidGateState {
    @Override
    public IPaidGateState successfulPayment() {
        System.out.println("Payment was successful, opening the gate");
        return new OpenPaidGateState();
    }

    @Override
    public IPaidGateState failedPayment() {
        System.out.println("Payment failed, gate will remain in closed state");
        return this;
    }

    @Override
    public IPaidGateState enter() {
        System.out.println("Gate is closed, Please pay before you enter");
        return this;
    }
}
