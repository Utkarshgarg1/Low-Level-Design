package patterns.creational.abstract_factory;

public class OldSofa implements Sofa{
    @Override
    public void create() {
        System.out.println("Sofa created");
    }
}
