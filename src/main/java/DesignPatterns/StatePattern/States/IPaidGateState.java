package DesignPatterns.StatePattern.States;

public interface IPaidGateState {
    IPaidGateState successfulPayment();
    IPaidGateState failedPayment();
    IPaidGateState enter();
}
