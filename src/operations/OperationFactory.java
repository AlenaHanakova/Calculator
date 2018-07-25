package operations;

import java.util.ArrayList;

public class OperationFactory {

    /**
     * If the operationName is known, returns instance of given Operation with number passed as an argument.
     * If not, return null.
     * @param operationName Name of the operation that is to be returned.
     * @param number Number that is to be passed to the operation.
     * @return If existent, returns given Operation, if not, returns null.
     */
    public static Operation getOperation(String operationName, double number) {
        switch (operationName) {
            case "add":
                return new Add(number);
            case "multiply":
                return new Multiply(number);
            case "subtract":
                return new Subtract(number);
            default:
                return null;
        }
    }

    /**
     * Performs all the operations from the list on the number that is passed as the second argument. Returns the result.
     * @param listOfOperations List of all operations that are to be performed.
     * @param startingNumber The starting number for the operations.
     * @return The result of all mathematicla operations.
     */
    public static double getResult(ArrayList<Operation> listOfOperations, double startingNumber) {

        for (Operation operation : listOfOperations) {
            startingNumber = operation.perform(startingNumber);
        }

        return startingNumber;

    }
}
