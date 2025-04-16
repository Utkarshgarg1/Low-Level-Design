package designs.parking_lot.vechiles;

 public class VechileFactory {
    public static Vechile createVechile(String vechileType, String licencePlate){
        if(vechileType.equalsIgnoreCase("Car")){
            return new Car(licencePlate);
        }
        else if(vechileType.equalsIgnoreCase("Bike")){
            return  new Bike(licencePlate);
        }
        return null;
    }
}
