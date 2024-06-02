package Shape;

public class Demo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5] ;
        shapes[0]  = new Quad(ShapeColor.PINK, 4);
        shapes[1] = new Circle(ShapeColor.BLACK, 8);
        shapes[2] = new Triangle(ShapeColor.RED,7,9);
        shapes[3] = new Rectangle(ShapeColor.WHITE, 2,7);
        shapes[4] = new Rhombus(ShapeColor.GREEN, 2,5);
        Printer printer = new ConsolPrinter();
        //printer.printShape(shapes[0]);
        //printer.printColor(shapes[0]);
        //printer.printSquare(shapes[0]);
        //printer.printShape(shapes[1]);
        //printer.printColor(shapes[1]);
        //printer.printSquare(shapes[1]);
        //printer.printShape(shapes[2]);
        //printer.printColor(shapes[2]);
        //printer.printSquare(shapes[2]);
        //printer.printShape(shapes[3]);
        //printer.printColor(shapes[3]);
        //printer.printSquare(shapes[3]);
        //printer.printShape(shapes[4]);
        //printer.printColor(shapes[4]);
        //printer.printSquare(shapes[4]);

        for(Shape shape : shapes){
            printer.printShape(shape);
            printer.printColor(shape);
            printer.printSquare(shape);

        }





    }

}
