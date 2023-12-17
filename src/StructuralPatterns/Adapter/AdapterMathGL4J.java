package StructuralPatterns.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterMathGL4J implements IPlotter {
    private final MathGL4J realPlotter = new MathGL4J();
    @Override
    public void plot(IFunction fun, Boundary boundary) {
        realPlotter.myPlot(convert(fun, boundary));
    }

    List<MathGL4J.Point> convert(IFunction fun, Boundary boundary) {
        final int N = 100;
        var lag = (boundary.right - boundary.left) / (N-1);
        var x = boundary.left;

        List<MathGL4J.Point> points = new ArrayList<>();

        while(x <= boundary.right) {
            points.add(new MathGL4J.Point(x, fun.value(x)));
            x += lag;

        }
        return points;
    }
}
