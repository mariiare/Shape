package Shape;

public class Triangle extends Shape{
    public int getBasis() {
        return basis;
    }

    public void setBasis(int basis) {
        this.basis = basis;
    }

    private int basis;

    public int getHeigth() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private  int height;



    public Triangle(ShapeColor color, int basis, int height) {
        super(color);
        this.basis = basis;
        this.height = height;

    }
    public double squareCalculator() {
        return 0.5 * height * basis;
    }



    @Override
    public String getName() {
        return "Triangle";
    }
}
