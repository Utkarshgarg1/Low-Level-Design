package designs.parking_lot.gates;

import designs.parking_lot.parkinglot.ParkingLot;
import designs.parking_lot.parkinglot.ParkingSpot;
import designs.parking_lot.payment.PaymentService;
import designs.parking_lot.vechiles.Vechile;
import designs.parking_lot.vechiles.VechileFactory;

public class ExitGate {
    private ParkingLot parkingLot;
    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService){
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber, int hourStayed){
        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);
        if(spot == null || !spot.isOccupied()){
            System.out.println("Invalid Spot");
            return;
        }

        Vechile vechile = spot.getVechile();

        if(vechile == null){
            System.out.println("No vechile found");
            return;
        }

        int fee = vechile.calculatePrice(hourStayed);
        paymentService.processPayment(fee);

        parkingLot.vacateSpot(spot,vechile);
        System.out.println("Spot Vacated! Please visit again");

    }

}
