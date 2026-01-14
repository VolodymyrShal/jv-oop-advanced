package core.basesyntax.figure;

public class Rectangle extends Figure{
    public final double length;
    public final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq. units " + "length " + length + " width "
                + width + " color " + getColor());
    }
}
