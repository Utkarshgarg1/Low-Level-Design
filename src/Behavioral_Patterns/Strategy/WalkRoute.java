package Behavioral_Patterns.Strategy;

public class WalkRoute implements Route{
    @Override
    public void buildRoute() {
        System.out.println("Route for walk");
    }
}
