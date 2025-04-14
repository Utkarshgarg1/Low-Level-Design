package patterns.creational.factory;

public class ShapeFactory {
    public Shape createShape(String type) {
        switch (type) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return new Circle();

        }
    }
}
