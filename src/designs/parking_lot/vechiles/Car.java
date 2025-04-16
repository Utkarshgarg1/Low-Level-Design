package designs.parking_lot.vechiles;

public class Car extends Vechile{

    private final int rate = 20;
    Car(String licensePlate) {
        super(licensePlate, "Car");
    }

    @Override
    public int calculatePrice(int hourStayed) {
        return hourStayed * rate;
    }


}
