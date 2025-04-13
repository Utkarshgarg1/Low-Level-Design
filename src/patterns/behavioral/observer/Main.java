package patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
       Amazon amazon = new Amazon();
       Customers customer1 = new Customers("Bob");
       Customers customer2 = new Customers("Alice");
       Customers customer3 = new Customers("Pam");

       amazon.addSubscriber("Sale", customer1);
       amazon.addSubscriber("Iphone", customer2);
       amazon.addSubscriber("Electronics",customer3);

       amazon.updateData("Iphone", "New Discount");
    }
}
