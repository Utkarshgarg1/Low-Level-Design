package patterns.structural.decorator;

public class BasicPizza implements Pizza{
    @Override
    public String getDesciption() {
        return "Basic Pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
