package designs.parking_lot.parkinglot;

import designs.parking_lot.vechiles.Vechile;

public class BikeParkingSpot extends ParkingSpot{
    BikeParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    @Override
    public boolean canParkVechile(Vechile vechile) {
        return "bike".equalsIgnoreCase(vechile.getVechileType());
    }
}
