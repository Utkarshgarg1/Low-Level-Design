package patterns.creational.builder.telescopic_builder;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.PizzaBuilder("Large").addCheese().addMushrooms().build();

        myPizza.display();

    }
}
