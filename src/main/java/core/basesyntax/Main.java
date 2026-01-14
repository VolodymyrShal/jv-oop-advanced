package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {

    static final int FIGURES_COUNT = 6;

    public static void main (String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
