package Adapter;

public class Sin implements IFunction {

    @Override
    public double value(double x) {
        return Math.sin(x);
    }
}
