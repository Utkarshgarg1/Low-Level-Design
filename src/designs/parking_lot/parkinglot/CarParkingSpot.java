package designs.parking_lot.parkinglot;

import designs.parking_lot.vechiles.Vechile;

public class CarParkingSpot extends ParkingSpot{
    CarParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVechile(Vechile vechile) {
        return "Car".equalsIgnoreCase(vechile.getVechileType());
    }
}
