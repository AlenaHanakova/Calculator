package operations;

public class Add extends Operation {
    protected Add(double x) {
        super(x);
    }

    @Override
    public double perform(double previousNumber) {
        return previousNumber + x;
    }
}
