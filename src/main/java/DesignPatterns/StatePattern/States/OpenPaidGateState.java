package DesignPatterns.StatePattern.States;

public class OpenPaidGateState implements IPaidGateState {
    @Override
    public IPaidGateState successfulPayment() {
        System.out.println("Payment will be refunded, as you have already paid for this trip");
        return this;
    }

    @Override
    public IPaidGateState failedPayment() {
        System.out.println("Payment was failed, you have already paid for the trip, please enter");
        return this;
    }

    @Override
    public IPaidGateState enter() {
        System.out.println("Passenger has passed through the gate, closing the gate now");
        return new ClosedPaidGateState();
    }
}
