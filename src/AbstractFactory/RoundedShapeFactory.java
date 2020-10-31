package AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType.toUpperCase()) {
            case "RECTANGLE" -> new RoundedRectangle();
            case "SQUARE" -> new RoundedSquare();
            default -> null;
        };
    }
}
