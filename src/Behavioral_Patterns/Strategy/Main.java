package Behavioral_Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Context route = new Context(new WalkRoute());
        route.buildRoute(); // Print Walk Route

        route.setRoute(new RoadRoute());
        route.buildRoute(); // Print Road Route
    }
}
