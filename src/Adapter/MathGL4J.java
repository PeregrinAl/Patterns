package Adapter;
import java.util.List;

public class MathGL4J {
    public static class Point {
        public double x;
        public double y;

        public Point(double x, double value) {
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
    public void myPlot(List<Point> points) {
        System.out.println(points);
    }
}
