package patterns.structural.decorator;

public abstract class Toppings implements Pizza{
    Pizza pizza;

    Toppings(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDesciption(){
        return pizza.getDesciption();
    }

    @Override
    public int getCost(){
        return pizza.getCost();
    }

}
