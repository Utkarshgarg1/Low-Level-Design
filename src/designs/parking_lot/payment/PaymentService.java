package designs.parking_lot.payment;

import java.util.Scanner;

public class PaymentService {
    private Scanner scanner;

    public PaymentService(Scanner scanner){
        this.scanner = scanner;
    }

    public void processPayment(int amount){
        choosePaymentMethod(amount);
    }

    private void choosePaymentMethod(int amount){
        System.out.println("Total amount: " + amount);
        System.out.println("Choose payment method");
        System.out.println("1 UPI");
        System.out.println("2 Card");
        System.out.println("3 Cash");
        int choice = scanner.nextInt();
        Payment payment;
        switch (choice){
            case 1:
                payment = new Payment(new UpiPayment(),amount);
                break;
            case 2:
                payment = new Payment(new CardPayment(),amount);
            case 3:
                payment = new Payment(new CashPayment(),amount);
            default:
                System.out.println("Invalid Choice");
                payment = new Payment(new CashPayment(),amount);
                break;
        }

        payment.completeTransaction();
    }
}
