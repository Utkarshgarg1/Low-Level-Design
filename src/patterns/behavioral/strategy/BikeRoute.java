package patterns.behavioral.strategy;

public class BikeRoute implements Route{
    @Override
    public void buildRoute() {
        System.out.println("Bike Route");
    }
}
