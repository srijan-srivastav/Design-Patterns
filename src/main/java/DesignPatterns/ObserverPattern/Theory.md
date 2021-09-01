## Observer Pattern

Used when external clients are interested in the state of an object and want to perform some action when that state changes

There could be multiple subscribers for the changes in the object, there can be 2 ways to do it
1. Poll
2. Push

With Poll -  asking the object if it's state has changed every few milliseconds or seconds is not an efficient way to do things
Since, there can be a lot of subscribers it would add unnecessary load

So, we would prefer a push mechanism where the object of interest would notify the subscribers that it's state has changed
This is what the observer pattern helps us achieve

This is to represent a one to many relationship

upon notify you could either choose to send the object of interest or have a reference to it while instantiating the subscriber
and injecting it in the constructor