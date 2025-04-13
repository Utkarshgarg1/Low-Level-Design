package patterns.behavioral.observer;

public class Customers implements Subscriber{
    private String name;

    Customers(String name){
        this.name = name;
    }
    @Override
    public void update(String event, String data) {
        System.out.println("Hey! " + name + " " + event +" "+ data);
    }
}
