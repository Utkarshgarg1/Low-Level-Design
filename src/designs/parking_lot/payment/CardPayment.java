package designs.parking_lot.payment;

public class CardPayment implements PaymentStrategy{

    @Override
    public void doneTransaction(int rate) {
        System.out.println("Payment dine by Card " + rate);
    }
}
