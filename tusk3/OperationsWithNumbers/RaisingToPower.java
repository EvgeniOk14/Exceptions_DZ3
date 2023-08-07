package OperationsWithNumbers;

import ClassCalculator.Calculator;
import Exceptions.RaisingToDegreeException;

import java.util.ArrayList;

public class RaisingToPower
{
    public void raisingToPower(double x, double y, ArrayList list) throws RaisingToDegreeException
    {

        if (y < 0)
        {
            throw new RaisingToDegreeException("Степень должна быть положительной! ");
        }
        else
        {
            double result = Math.pow(x, y);
            System.out.println("Результат возведения в степень: " + x + " ^ " + y + " = " + result);
            System.out.println("");
            Calculator calculator = new Calculator(list);
            calculator.saveOperation("возведение в степень ", result);
        }
    }
}
