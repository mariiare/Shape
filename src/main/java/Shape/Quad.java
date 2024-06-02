package Shape;


public class Quad extends Shape {
    private int sideSize;
    public Quad(ShapeColor color, int sideSize) {
        super(color);
        this.sideSize = sideSize;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }




    public double squareCalculator() {
        return sideSize * sideSize;
    }


    @Override
    public String getName() {
        return "Quad";
    }

}
