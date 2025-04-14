package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new Cheese(new Mushroom(pizza));

        System.out.println(pizza.getDesciption());
    }
}
