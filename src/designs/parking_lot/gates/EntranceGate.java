package designs.parking_lot.gates;

import designs.parking_lot.parkinglot.ParkingLot;
import designs.parking_lot.parkinglot.ParkingSpot;
import designs.parking_lot.vechiles.Vechile;
import designs.parking_lot.vechiles.VechileFactory;

import java.util.Scanner;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public void processEntrance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vechile type (car ot Bike: ");
        String vechileType = scanner.next();
        System.out.println("Enter Licence Number");
        String licencePlate = scanner.next();

        Vechile vechile = VechileFactory.createVechile(vechileType,licencePlate);

        if(vechile == null){
            System.out.println("Invalid Vehicle Type");
            return;
        }
        System.out.println(vechile.toString());
        ParkingSpot parkingSpot = parkingLot.parkVechile(vechile);
        if(parkingSpot != null){
            System.out.println("Welcome!!");
        }
        else{
            System.out.println("Sorry! Parking is full");
        }
    }
}
