## Strategy Pattern!

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.


![My diagram](https://refactoring.guru/images/patterns/diagrams/strategy/structure-2x.png?id=5bd791857c3bab419bcf4fa86877439d "Diagram Title")

### Example

You are designing a travel app where you need to provide routes from Point A to Point B. You have four travel options: Bus, Car, Bike, and Walk. You create an interface called Route and implement it in separate classes for each travel mode. However, you notice that the route functionality for Bus and Car is the same, but you are writing it twice, which violates the DRY (Don't Repeat Yourself) principle.

#### Better Approach

You create a interface and 

To solve this problem and follow the Strategy Design Pattern effectively, we first define a RouteStrategy interface that declares the method for building a route. For travel modes like Bus and Car, which share the same routing logic, we create a common class, such as RoadRoute, to avoid code duplication and respect the DRY principle. For other modes like Bike and Walk, we implement separate strategy classes with their specific logic. Then, we design a context class called Navigator that uses a RouteStrategy instance to build routes dynamically. This way, we can switch strategies at runtime based on the user’s choice of travel mode. This approach keeps the code clean, promotes reusability, and demonstrates the Strategy Design Pattern effectively by encapsulating the varying algorithms within separate strategy classes.


