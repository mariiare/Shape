package Shape;

public class Rhombus extends Shape{
    private int sideSize;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
    public Rhombus(ShapeColor color, int sideSize, int height) {
        super(color);
        this.sideSize = sideSize;
        this.height = height;
    }






    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }
    public double squareCalculator() {
        return sideSize * height;
    }


    @Override
    public String getName() {
        return "Rhombus";
    }
}
