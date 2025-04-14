package patterns.structural.decorator;

public class Cheese extends Toppings{
    Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDesciption(){
        return super.getDesciption() + ", Cheese";
    }

    @Override
    public int getCost(){
        return super.getCost() + 10;
    }
}
