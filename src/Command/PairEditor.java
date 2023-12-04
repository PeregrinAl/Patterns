package Command;
// receiver (получатель)
public class PairEditor {
    public History history = new History();
    private int numberA = 0;
    private int numberB = 0;
    private int result = 0;

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int result) {
        this.result = result;
    }

    public void setResult(int numberB) {
        this.numberB = numberB;
    }

    public int getNumberA() {return this.numberA;}
    public int getNumberB() {return this.numberB;}
    public int getResult() {return this.result;}
    @Override
    public String toString() {
        return String.format("param a: %d, param b: %d\n", numberA, numberB);
    }
}

