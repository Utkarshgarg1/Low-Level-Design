package designs.parking_lot.payment;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void doneTransaction(int rate) {
        System.out.println("Payment Done by UPI "+ rate);
    }
}
