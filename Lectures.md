# Design Patterns

Regardless of the kind of software you develop in object oriented setting, be it a web application, android app or system software, there are some common patterns of problems that arise repeatedly. Each design pattern aims to provide a general solution to a these problems.

Design patterns can be broadly classified into three types.
  - Structural - Relates to structuring or organizing data
  - Behavioral - Relates to communication between objects 
  - Creational - Relates to object creation
  
## 1. Strategy pattern

### Type: Behavioral

### Definition (from Head First Design Patterns)
  - Stategy pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
  - Strategy lets the algorithm be very independent from the clients that use it. i.e. clients don't have to change if the algorithm changes.
  
### Example scenario
Let's say you have list and you have a method to sort the contents of the list inbuilt in the List class. Now the sorting behavior is tightly coupled. The strategy pattern says we can decouple the 'sorting' behavior from the list implementation and move it outside and inject it to sort the list in different ways.

### Example from Java library
Comparator from Java Collections

### Underlying principle
  - Use composition over inheritance to achive better flexibility.

###
