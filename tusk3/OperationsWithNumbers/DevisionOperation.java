package OperationsWithNumbers;

import ClassCalculator.Calculator;
import Exceptions.DivisionByNullException;

import java.util.ArrayList;

public class DevisionOperation
{
    public void devisionOperation(double x, double y, ArrayList list) throws DivisionByNullException
    {
        if(y == 0)
        {
            throw new DivisionByNullException("Делить на ноль нельзя! ");
        }
        else {
            double result = x / y;
            System.out.println("Результат деления: " + x + " / " + y + " = " + result);
            System.out.println("");
            Calculator calculator = new Calculator(list);
            calculator.saveOperation("деление ", result);
        }

    }
}

