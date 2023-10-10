package Adapter;

public interface IPlotter {
    public class Boundary {
        public Boundary(double left, double right) {
            this.left = left;
            this.right = right;
        }// static?
        public double left;
        public double right;
    }
    void plot(IFunction fun, Boundary boundary);
}
