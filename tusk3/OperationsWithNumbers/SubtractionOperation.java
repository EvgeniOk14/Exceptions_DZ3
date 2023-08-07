package OperationsWithNumbers;

import ClassCalculator.Calculator;
import Exceptions.RaisingToDegreeException;

import java.util.ArrayList;

public class SubtractionOperation
{
    public void subtractionOperation(double x, double y, ArrayList list) throws RaisingToDegreeException
    {
        double result = x -y;
        System.out.println("Результат вычитания: " + x + " - "  + y + " = " + result);
        System.out.println("");
        Calculator calculator = new Calculator(list);
        calculator.saveOperation("вычитание ", result);
    }
}

