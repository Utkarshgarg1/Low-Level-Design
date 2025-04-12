package patterns.behavioral.strategy;

public class WalkRoute implements Route{
    @Override
    public void buildRoute() {
        System.out.println("Route for walk");
    }
}
