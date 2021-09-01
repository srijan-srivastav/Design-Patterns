package DesignPatterns.ObserverPattern.Observers;

import DesignPatterns.ObserverPattern.Observables.IObservable;

import java.util.Map;

public interface IObserver {
    void update(IObservable observable);
}
