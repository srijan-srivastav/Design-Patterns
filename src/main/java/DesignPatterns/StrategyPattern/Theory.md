## **Strategy Pattern**

Strategy pattern talks about the idea of favouring composition over inheritance. In use cases where we have a family of algorithms that define
the behaviour for the clients.

By composition, we are injecting that behaviour in the client by using the "HAS-A" relationship, this also allows us to change behaviour at runtime
by setting that behaviour to a different algorithm.

If we talk about the example of Birds,
1. We can have a superclass called Birds
   a. It has methods - Fly(), Eat(), Display()
   b. Now different birds classes which extend "Birds" like "Eagle", "Sparrow", "Parrot", "RubberBird"
   c. Now if you are not careful, unknowingly by inheritance you will give the behaviours that the "Bird" class had to the subclasses like "RubberBird"
   d. Now you need to override these methods to specify the behaviour
   e. It could be possible that there are multiple subclasses that differ from the base class but share the behaviour among themselves, this will introduce code duplication
   f. Now the solution here will be to extract out the behaviours into different subclasses which will implement IBehaviour abstraction
   g. You have separated out the family of algorithms for that particular behaviour
   h. These behaviours can now be injected into the super class using composition, so the "Birds" superclass will have a field private IBehaviour behaviour;
   i. Now, these behaviours can be injected during the object creation and same algorithm/behaviour can be injected to different instances.
   j. This solves the problem of code duplication, allows change of behaviour at runtime and removes the tight coupling
   k. Now these behaviours can be injected using constructors when we create our objects, we can also change the behaviour at runtime by changing the IBehaviour reference to a different algorithm
   
In conclusion, this allows change of behaviours without having to modify the client code.

   



