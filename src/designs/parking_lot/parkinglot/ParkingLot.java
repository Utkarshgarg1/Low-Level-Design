package designs.parking_lot.parkinglot;

import designs.parking_lot.vechiles.Vechile;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors){
        this.floors = floors;
    }

    public ParkingSpot findAvailableSpot(Vechile vechile){
        for(ParkingFloor floor : floors){
            ParkingSpot spot = floor.availableSpot(vechile.getVechileType());
            if(spot!=null){
                spot.parkVechile(vechile);
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVechile(Vechile vechile){
        ParkingSpot spot = findAvailableSpot(vechile);
        if(spot!=null){
            System.out.println("Your " + vechile.getVechileType() + " is parked at " + spot.getSpotNumber());
            return spot;
        }
        else{
            System.out.println("No parking slot available");
            return  null;
        }
    }

    public void vacateSpot(ParkingSpot spot, Vechile vechile){
        if(spot!=null && spot.isOccupied && spot.getVechile().equals(vechile)){
            spot.vacate();
            System.out.println("Your " + vechile.getVechileType() + " has vacted the " + spot.getSpotNumber());
        }
        else{
            System.out.println("Invalid operation! Either the spot is already vacant or the vehicle does not match.");
        }
    }

    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (spot.getSpotNumber() == spotNumber) {
                    return spot;
                }
            }
        }
        return null;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
