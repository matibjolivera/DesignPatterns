package AbstractFactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw: " + this.getClass().getSimpleName());
    }
}