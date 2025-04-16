package designs.parking_lot.parkinglot;

import designs.parking_lot.vechiles.Vechile;

public abstract class ParkingSpot {
     int spotNumber;
    Vechile vechile = null;
    String spotType;
    boolean isOccupied;

    ParkingSpot(int spotNumber, String spotType){
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        isOccupied = false;
    }

    public boolean isOccupied(){
        return isOccupied;
    }

    public abstract boolean canParkVechile(Vechile vechile);

    public void parkVechile(Vechile vechile){
        if(canParkVechile(vechile) && !isOccupied){
            this.vechile = vechile;
            isOccupied = true;
        }
        else {
            System.out.println("Cannot park");
        }
    }

    public void vacate(){
        if(!isOccupied) System.out.println("Spot is already Vacted");
        this.isOccupied = false;
        this.vechile = null;
    }

    public int getSpotNumber(){
        return this.spotNumber;
    }

    public Vechile getVechile(){
        return this.vechile;
    }

    public String getSpotType(){
        return this.spotType;
    }

    @Override
    public String
    toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", vechile=" + vechile +
                ", spotType='" + spotType + '\'' +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
