package designs.parking_lot.payment;

public class CashPayment implements PaymentStrategy{

    @Override
    public void doneTransaction(int rate) {
        System.out.println("Payment done by cash " + rate);
    }
}
