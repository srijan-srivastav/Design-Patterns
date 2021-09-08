package DesignPatterns.StatePattern.Context;

import DesignPatterns.StatePattern.States.ClosedPaidGateState;
import DesignPatterns.StatePattern.States.IPaidGateState;

public class MetroGate implements IGate{
    private IPaidGateState gateState;

    public MetroGate(IPaidGateState closedPaidGateState) {
        this.gateState = new ClosedPaidGateState();
    }

    public void successfulPayment() {
        this.gateState = gateState.successfulPayment();
    }

    public void failedPayment() {
        this.gateState = gateState.failedPayment();
    }

    public void enter() {
        this.gateState = gateState.enter();
    }

}
