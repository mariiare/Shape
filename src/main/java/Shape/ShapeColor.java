package Shape;

public enum ShapeColor {
    PINK("pink"),
    RED("red"),
    BLUE("blue" ),
    BLACK("black"),
    WHITE("white"),
    YELLOW("yellow" ),
    ORANGE("orange"),
    VIOLET("violet"),
    GREEN("green"),
    GRAY("gray");
    private String colorName;
    public String shapeColorName() {
        return colorName;
    }
    ShapeColor(String colorName) {
        this.colorName = colorName;

    }



}