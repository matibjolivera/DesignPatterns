package AbstractFactory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw: " + this.getClass().getSimpleName());
    }
}
