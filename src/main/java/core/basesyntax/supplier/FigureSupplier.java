package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double MAX_RANDOM_SIZE = 11;
    private static final double DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = supplier.getRandomColor();
        FigureType[] types = FigureType.values();
        FigureType randomFigure = types[random.nextInt(types.length)];

        double val = random.nextDouble(1, MAX_RANDOM_SIZE);
        double width = val + 2;
        double secondLeg = val + 3;
        double baseA = val + 2;
        double baseB = val + 1;

        return switch (randomFigure) {
            case SQUARE -> new Square(color, val);
            case RECTANGLE -> new Rectangle(color, val, width);
            case RIGHT_TRIANGLE -> new RightTriangle(color, val, secondLeg);
            case CIRCLE -> new Circle(color, val);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, val, baseA, baseB);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }
}
