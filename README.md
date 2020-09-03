# SOLID Design Principles

SOLID is a popular set of design principles in software development. It's a mnemonic acronym for the following five design principles

## Single Responsibility Principle (SRP)

    A class should have one, and only one, reason to change

Single Responsibility Principle makes your software easier to write and maintain over the long term. 
The more responsibilities it has, the more reasons it has to chnage and this makes it more complicated to maintain down the road.
The side benefit to following SRP is that the individual components are simpler to implement and understand

## Open/Closed Principle (OCP)

    Classes should be open for extension, but closed for modification
    
The idea behind this principle is to define your classes in such a way you will be able to add new functionality 
or make changes without modifying existing classes. One way of achieving this is via interfaces, an additional level of abstraction
that allows for loose coupling.

## Liskov Substitution Principle (LSP)

    Instances of a superclass should be replaceable by instances of its subclass without breaking the application
    
What LSP essentially does is focus a light on your inheritance heirarchy and whether it truly represents an 'is-a' relationship.
It requires that the instances of the subclass behave in the same way as instance of their superclass. It cannot in any way
strengthen the pre-conditions or weaken the post-conditions

## Interface Segregation Principle (ISP)

    Clients should not be forced to implement methods in interfaces that they do not need
    
You should not have interfaces that are over-arching. Large interfaces should be split into more granular/smaller interfaces.
Doing so ensures that implementing classes are allowed to implement only the methods they are concerned with.

## Dependency Inversion Principle (DI)

    High-level modules should not depend on low-level modules. Both should depend on abstractions
    
Higher-level modules should not be tightly coupled with the implementation of the lower level modules.  You can achieve this
decoupling by introducing interface abstractions that higher level modules implement.
    
