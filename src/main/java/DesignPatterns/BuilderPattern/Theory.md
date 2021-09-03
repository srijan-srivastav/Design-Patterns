## Builder Pattern

1. Builder pattern is a creational pattern
2. It helps in creating composite objects
3. Useful when there are several optional parameters
   a. Don't have to create telescoping constructors
   b. Increases readability
   c. Having too many variables in the constructor is error prone, easy to mess up the order
4. Builder pattern allows fine granularity for object creation
5. Factory pattern is also a creational pattern, but it expects the object to be created in one step
6. General recommendation is to start with factory pattern and as you feel that the object creation is getting more complex
   we can introduce builder pattern in the design