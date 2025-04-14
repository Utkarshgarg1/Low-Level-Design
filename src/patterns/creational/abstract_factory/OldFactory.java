package patterns.creational.abstract_factory;

public class OldFactory implements Furniture_Factory{
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldSofa();
    }
}
