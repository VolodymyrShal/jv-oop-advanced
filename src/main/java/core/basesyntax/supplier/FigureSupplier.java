package core.basesyntax.supplier;

import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private final double MAX_RANDOM_SIZE = 11;
    private static final double DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        String color = supplier.getRandomColor();
        FigureType[] types = FigureType.values();
        FigureType randomFigure = types[random.nextInt(types.length)];

        double val = random.nextDouble(1, MAX_RANDOM_SIZE);

        return switch (randomFigure) {
            case SQUARE -> new Square(color, val);
            case RECTANGLE ->  new Rectangle(color, val, val + 2);
            case RIGHT_TRIANGLE -> new RightTriangle(color, val, val + 3);
            case CIRCLE -> new Circle(color, val);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, val, val + 2, val + 1);
        };
    }
    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
