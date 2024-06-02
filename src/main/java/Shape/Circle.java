package Shape;

public class Circle extends Shape{
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    private int radius;

    public Circle(ShapeColor color, int radius) {
        super(color);
        this.radius = radius;
    }
    public double squareCalculator() {
        return 3 * Math.PI * radius;
    }

    public Circle(ShapeColor color){
        super(color);
    }

    @Override
    public String getName() {
        return "Circle";
    }

}


