package Behavioral_Patterns.Strategy;

public class RoadRoute implements Route{

    @Override
    public void buildRoute() {
        System.out.println("Route from Road");
    }
}
