package designs.parking_lot.main;

import designs.parking_lot.gates.EntranceGate;
import designs.parking_lot.gates.ExitGate;
import designs.parking_lot.parkinglot.ParkingFloor;
import designs.parking_lot.parkinglot.ParkingLot;
import designs.parking_lot.payment.PaymentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ParkingFloor floor = new ParkingFloor(1,10,8);
        ArrayList<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(floor);
        ParkingLot parkingLot = new ParkingLot(parkingFloors);

        PaymentService paymentService = new PaymentService(scanner);

        EntranceGate entranceGate = new EntranceGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot, paymentService);

        System.out.println("\n================================");
        System.out.println("  WAY TO PARKING");
        System.out.println("\n================================");

        boolean exit = false;

        while(!exit){
            showMenu();

            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    parkVehicle(entranceGate);
                    break;

                case 2:
                    vacateSpot(exitGate, scanner);
                    break;

                case 3:
                    exit = true;
                    System.out.println("Thank you for using the Parking Lot System!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
    }

    private static void showMenu(){
        System.out.println("\n******************************************************");
        System.out.println("Please choose an option from below:");
        System.out.println("1. Park a vehicle");
        System.out.println("2. Vacate a vehicle spot");
        System.out.println("3. Exit the system");
        System.out.println("******************************************************");
    }

    private static int getUserChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void parkVehicle(EntranceGate entranceGate) {
        entranceGate.processEntrance();
    }

    private static void vacateSpot(ExitGate exitGate, Scanner scanner) {
        System.out.println("Enter the spot number to vacate: ");
        int spotNumber = scanner.nextInt();
        System.out.println("Enter the number of hours the vehicle stayed: ");
        int hoursStayed = scanner.nextInt();
        exitGate.processExit(spotNumber, hoursStayed);
    }
}
