package designs.parking_lot.parkinglot;

import designs.parking_lot.vechiles.Vechile;

import java.time.LocalDateTime;

public class Ticket {
    ParkingSpot parkingSpot;
    Vechile vechile;
    LocalDateTime startTime;

    public Ticket(ParkingSpot parkingSpot, Vechile vechile){
        this.parkingSpot = parkingSpot;
        this.startTime = LocalDateTime.now();
        this.vechile = vechile;
    }

}
