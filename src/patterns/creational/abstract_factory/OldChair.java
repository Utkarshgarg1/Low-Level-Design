package patterns.creational.abstract_factory;

public class OldChair implements Chair{

    @Override
    public void create() {
        System.out.println("Old Chair");
    }
}
