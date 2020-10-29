package Factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        return switch (shapeType.toUpperCase()) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
