package operations;

public abstract class Operation {
    double x;

    protected Operation(double x) {
        this.x = x;
    }

    /**
     * Performs given operation on the number that is passed as an argument. Returns the result.
     * @param previousNumber Starting number for the operation.
     * @return Result of the operation.
     */
    public abstract double perform(double previousNumber);


}
