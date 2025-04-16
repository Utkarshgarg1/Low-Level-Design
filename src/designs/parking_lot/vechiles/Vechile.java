package designs.parking_lot.vechiles;

public abstract class Vechile {
    private String licensePlate;
    private String vechileType;

    Vechile(String licensePlate, String vechileType){
        this.licensePlate = licensePlate;
        this.vechileType = vechileType;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public String getVechileType(){
        return vechileType;
    }

    public abstract int calculatePrice(int hourStayed);

    @Override
    public String toString() {
        return "Vechile{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vechileType='" + vechileType + '\'' +
                '}';
    }
}
