package patterns.creational.abstract_factory;

public class Main {
    private Chair chair;
    private Sofa sofa;

    public Main(Furniture_Factory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void createFurniture(){
        chair.create();
        sofa.create();
    }

    public static void main(String[] args) {
        Furniture_Factory factory = new ModernFactory();
        Main obj = new Main(factory);
        obj.createFurniture();
    }
}
