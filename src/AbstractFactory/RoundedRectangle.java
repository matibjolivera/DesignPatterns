package AbstractFactory;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw: " + this.getClass().getSimpleName());
    }
}