package AbstractFactory;

public class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw: " + this.getClass().getSimpleName());
    }
}