package AbstractFactory;

public class Demo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        shapeFactory.getShape("RECTANGLE").draw();
        shapeFactory.getShape("SQUARE").draw();

        AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);

        shapeFactoryRounded.getShape("RECTANGLE").draw();
        shapeFactoryRounded.getShape("SQUARE").draw();
    }
}
