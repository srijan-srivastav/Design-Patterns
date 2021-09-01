package DesignPatterns.ObserverPattern.Observables;

import DesignPatterns.ObserverPattern.Observers.IObserver;

import java.util.Observer;

public interface IObservable {
    void subscribe(IObserver observer);
    void unsubscribe(IObserver observer);
    void notifySubscribers();
}
