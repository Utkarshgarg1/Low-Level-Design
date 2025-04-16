package designs.parking_lot.vechiles;

public class Bike extends Vechile{

    private final int rate = 10;

    Bike(String licensePlate) {
        super(licensePlate, "Bike");
    }

    @Override
    public int calculatePrice(int hourStayed) {
        return hourStayed * rate;
    }
}
