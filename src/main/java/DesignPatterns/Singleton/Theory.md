Singleton pattern

This pattern ensures there is only one object of a class with a global point of access to it.

This makes it impossible to create multiple instances of the class after the first instance is created.
Next time you ask for the instance of that class, the same instance is always returned (global instance)

Singleton pattern is also considered as a code smell now days because
1. We are assuming that there will always be a single instance of this class, which can change in the future.
2. It makes unit testing harder because we may need to mock that class


Singleton Pattern
1. A private constructor (outside classes can't do new Singleton())
2. Outside world gains access to this instance via static method
   a. Static methods are class variable are not associated with the instance but with the class, it can be accesses from outside
   b. This static method decides if an instance already exists? then return that otherwise create one and return
   c. The class would hold the instance in a private static variable, static because it needs to accessible from the static method


Go for a singleton if we:

Require a complete object-oriented solution for the application
Need only one instance of a class at all given times and to maintain a state
Want a lazily loaded solution for a class so that it's loaded only when required

Use static classes when we:

Just need to store many static utility methods that only operate on input parameters and do not modify any internal state
Don't need runtime polymorphism or an object-oriented solution

Usually heavy objects in DAO layer, Factory Classes are made singleton. the pros:

Better memory usage
Low latency
Needs initialisation once


Cons of singleton:

Pollutes global namespace
Tight coupling, change in singleton class will cause change in the client code
Hard to unit test, since we can't mock singleton, difficult to mock singleton as an external dependency


   

   





