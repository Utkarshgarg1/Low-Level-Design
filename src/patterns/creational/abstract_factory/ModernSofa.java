package patterns.creational.abstract_factory;

public class ModernSofa implements Sofa{
    @Override
    public void create() {
        System.out.println("Modern Sofa");
    }
}
