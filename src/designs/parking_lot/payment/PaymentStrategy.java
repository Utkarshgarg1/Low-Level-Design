package designs.parking_lot.payment;

public interface PaymentStrategy {
    void doneTransaction(int rate);
}
