package Shape;

public class ConsolPrinter implements Printer {
    @Override
    public void printShape(Shape shape) {
        System.out.println("Name of the shape is " + shape.getName());
    }
    @Override
    public void printColor(Shape shape) {
        System.out.println("Color of " + shape.getName() + " is " + shape.getColorName());
    }
    @Override
    public void printSquare(Shape shape) {
        System.out.println("Square of " + shape.getName() + " is " + shape.squareCalculator());
    }
}

