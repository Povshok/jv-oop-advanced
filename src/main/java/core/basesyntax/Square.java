package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Colors color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor();
    }
}
