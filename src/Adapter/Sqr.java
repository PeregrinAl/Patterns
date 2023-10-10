package Adapter;

public class Sqr implements IFunction {
    @Override
    public double value(double x) {
        return x * x;
    }
}
