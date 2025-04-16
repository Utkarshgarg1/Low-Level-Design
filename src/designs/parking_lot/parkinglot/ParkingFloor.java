package designs.parking_lot.parkinglot;

import designs.parking_lot.vechiles.Vechile;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;
    private int floorNumber;

    public ParkingFloor(int floorNumber, int numOfCarSlots, int numOfBikeSlots){
          this.floorNumber = floorNumber;
          this.spots = new ArrayList<>();

          for(int i = 0; i < numOfCarSlots; i++){
              this.spots.add(new CarParkingSpot(i+1,"Car"));
          }

          for(int i = numOfCarSlots; i < numOfCarSlots + numOfBikeSlots; i++){
              this.spots.add(new BikeParkingSpot(i+1,"Bike"));
          }
    }

    public ParkingSpot availableSpot(String veichle){
        for(ParkingSpot spot : spots){
            if(!spot.isOccupied && veichle.equalsIgnoreCase(spot.getSpotType())){
                return spot;
            }

        }
        return null;
    }

    public List<ParkingSpot> getParkingSpots() {
        return spots;
    }

}
