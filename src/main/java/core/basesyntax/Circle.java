package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Colors color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + String.format("%.1f", getArea())
                + " sq.units, radius: " + radius
                + " units, color: " + getColor();
    }
}
