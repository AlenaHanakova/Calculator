package operations;

public class Subtract extends Operation {
    protected Subtract(double x) {
        super(x);
    }

    @Override
    public double perform(double previousNumber) {
        return previousNumber - x;
    }
}
