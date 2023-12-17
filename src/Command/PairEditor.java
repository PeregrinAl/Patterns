package Command;
// receiver (получатель)
public class PairEditor {
    public History history = new History();
    private int numberA = 0;
    private int numberB = 0;
    private double result = 0.0;

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setNumberB (int numberB) {
        this.numberB = numberB;
    }

    public int getNumberA() {return this.numberA;}
    public int getNumberB() {return this.numberB;}

    @Override
    public String toString() {
        return String.format("param a: %d, param b: %d, result: %f \n", numberA, numberB, result);
    }
}

