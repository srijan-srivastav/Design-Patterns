**Factory Method Pattern:**

ENCAPSULATE WHAT VARIES

1. Delegate the construction of objects of the same type to the factory based on some parameters.
2. Factory method pattern defines a framework via abstraction, where in the subclasses take care of the creation
   as well as you can choose to control the lifecycle of the concrete product, like packing it, calculating tax and shipping it
3. Factory pattern is useful when we don't know which instance we will be using beforehand, otherwise we could use
dependency injection to provide that dependency
4. Used to encapsulating the business logic of creation of object and will be reusable by different clients
5. We can have multiple factories that implement an abstraction, and give us the instance we need from the factories
depending upon the logic inside them
   
 
   
