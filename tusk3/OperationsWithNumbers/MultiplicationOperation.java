package OperationsWithNumbers;

import ClassCalculator.Calculator;

import java.util.ArrayList;

public class MultiplicationOperation
{
    public void multiplicationOperation(double x, double y, ArrayList list)
    {
        double result = x * y;
        System.out.println("Результат умножения: " + x + " * " + y + " = " + result);
        System.out.println("");
        Calculator calculator = new Calculator(list);
        calculator.saveOperation("умножение ", result);
    }

}
