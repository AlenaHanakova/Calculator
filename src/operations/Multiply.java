package operations;

public class Multiply extends Operation{
  protected Multiply(double x) {
        super(x);
    }

    @Override
    public double perform(double previousNumber) {
        return previousNumber * x;
    }
}
