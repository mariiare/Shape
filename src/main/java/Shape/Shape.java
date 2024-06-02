package Shape;

abstract class Shape implements Square{
    public abstract String getName();

    private ShapeColor color;
    public Shape(ShapeColor color){
        this.color = color;
    }
    public ShapeColor getColor() {
        return color;
    }
    public String getColorName(){
        return color.shapeColorName();
    }
    @Override
    public double squareCalculator() {
        return 0;
    }
}