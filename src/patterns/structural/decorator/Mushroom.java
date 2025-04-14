package patterns.structural.decorator;

public class Mushroom extends Toppings{

    Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesciption(){
        return super.getDesciption() + ", Mushroom";
    }

    @Override
    public int getCost(){
        return pizza.getCost() + 20;
    }
}
