package test.operations;

import operations.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class OperationFactoryTest {

    private static final String addStr = "add";
    private static final String subtractStr = "subtract";
    private static final String multiplyStr = "multiply";

    private static final double number1 = 7.0;
    private static final double number2 = 5.0;
    private static final double number3 = 3.0;

    @Test
    public void testFactoryAdd() {
        Operation addOperation = OperationFactory.getOperation(addStr, Math.random() * 10);
        Assert.assertTrue(addOperation instanceof Add);

    }

    @Test
    public void testFactorySubtract() {
        Operation subtractOperation = OperationFactory.getOperation(subtractStr, Math.random() * 10);
        Assert.assertTrue(subtractOperation instanceof Subtract);

    }

    @Test
    public void testFactoryMultiply() {
        Operation multiplyOperation = OperationFactory.getOperation(multiplyStr, Math.random() * 10);
        Assert.assertTrue(multiplyOperation instanceof Multiply);

    }

    @Test
    public void testGetResultAdd() {
        ArrayList<Operation> testList= new ArrayList<>();
        testList.add(OperationFactory.getOperation("add", number2));
        Assert.assertTrue(OperationFactory.getResult(testList, number1) == 12.0);

    }


    @Test
    public void testGetResultMultiply() {
        ArrayList<Operation> testList= new ArrayList<>();
        testList.add(OperationFactory.getOperation("multiply", number2));
        Assert.assertTrue(OperationFactory.getResult(testList, number1) == 35.0);

    }


    @Test
    public void testGetResultSubtract() {
        ArrayList<Operation> testList= new ArrayList<>();
        testList.add(OperationFactory.getOperation("subtract", number2));
        Assert.assertTrue(OperationFactory.getResult(testList, number1) == 2.0);

    }

    @Test
    public void testGetResultMultiOperation() {
        ArrayList<Operation> testList= new ArrayList<>();
        testList.add(OperationFactory.getOperation("add", number2));
        testList.add(OperationFactory.getOperation("subtract", number3));
        testList.add(OperationFactory.getOperation("multiply", number2));
        Assert.assertTrue(OperationFactory.getResult(testList, number1) == 45.0);

    }


}

