package patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shape =  new ShapeFactory();
        Shape obj = shape.createShape("Circle");
        obj.shape();

    }
}
