# BUILDER Design Pattern

The Builder pattern is a creational pattern - it is used for constructing or managing complex object creation.
As the number of arguments in a constructor grows, it becomes easy to incorrectly swap the arguments around especially if they are of
the same type. It is also possible that some arguments are optional, and having different constructor combinations or 
telescopic constructors as they are called becomes difficult to manage. 

The Builder pattern provides an approach to building these complex objects - instead of using so-called telescopic constructors
to manage the object creation.