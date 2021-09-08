package DesignPatterns.StatePattern;

import DesignPatterns.StatePattern.Context.MetroGate;
import DesignPatterns.StatePattern.States.ClosedPaidGateState;

public class Main {
    public static void main(String[] args) {
        MetroGate metroGate = new MetroGate(new ClosedPaidGateState());
        metroGate.failedPayment();
        metroGate.enter();
        metroGate.successfulPayment();
        metroGate.successfulPayment();
        metroGate.failedPayment();
        metroGate.enter();

        metroGate.successfulPayment();
        metroGate.failedPayment();
        metroGate.enter();

        metroGate.enter();
    }
}
