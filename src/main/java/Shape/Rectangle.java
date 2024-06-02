package Shape;


public class Rectangle extends Shape{
    private int sideSize;

    public int getOppositeSideSize() {
        return oppositeSideSize;
    }

    public void setOppositeSideSize(int oppositeSideSize) {
        this.oppositeSideSize = oppositeSideSize;
    }

    private int oppositeSideSize;
    public Rectangle(ShapeColor color, int sideSize, int oppositeSideSize) {
        super(color);
        this.sideSize = sideSize;
        this.oppositeSideSize = oppositeSideSize;
    }






    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }
    public double squareCalculator() {
        return sideSize * oppositeSideSize;
    }



    @Override
    public String getName() {
        return "Rectangle";
    }

}
