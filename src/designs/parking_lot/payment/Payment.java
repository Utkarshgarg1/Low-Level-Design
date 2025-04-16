package designs.parking_lot.payment;

public class Payment {
   private PaymentStrategy paymentStrategy;
   private int amount;

   Payment(PaymentStrategy paymentStrategy, int amount){
       this.paymentStrategy = paymentStrategy;
       this.amount = amount;
   }

   void completeTransaction(){
       paymentStrategy.doneTransaction(amount);
   }

}
