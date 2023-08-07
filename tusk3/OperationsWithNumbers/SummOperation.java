package OperationsWithNumbers;

import ClassCalculator.Calculator;

import java.util.ArrayList;

public class SummOperation
{
    public void summ(double x, double y, ArrayList list)
    {
        double result = x + y;
        System.out.println("Результат сложения: " + x + " + " + y + " = " + result);
        System.out.println("");
        Calculator calculator = new Calculator(list);
        calculator.saveOperation("сложение ", result);
    }
}
