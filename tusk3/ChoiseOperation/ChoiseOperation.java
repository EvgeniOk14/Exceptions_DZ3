package ChoiseOperation;

import ChangeValuesOfNumbersXY.ChangeValues;
import ClassCalculator.Calculator;
import CorrectInputOfNumber.CorrectInputOfNamber;
import Exceptions.DivisionByNullException;
import Exceptions.RaisingToDegreeException;
import OperationsWithNumbers.*;
import com.sun.jdi.PrimitiveValue;

import java.util.ArrayList;
import java.util.Scanner;

public class ChoiseOperation
{
    private static boolean work = true;
    private double x;
    private double y;
    private ArrayList list;

    public ChoiseOperation(double x, double y, ArrayList list)
    {
        this.x = x;
        this.y = y;
        this.list = list;
    }

    public void exit()
    {
        System.out.println("Работа завершена, Вы вышли из программы! ");
        work = false;
    }

    public void choiseOperation(double x, double y, ArrayList list)
    {
        while (work)
        {
            CorrectInputOfNamber correctInputOfNamber = new CorrectInputOfNamber();
            int operationNumber = correctInputOfNamber.correctInputOfNumber();
            {
                switch (operationNumber) {
                    case 1:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (+) сложение: \n");
                        SummOperation summOperation = new SummOperation();
                        summOperation.summ(x, y, list);
                        break;
                    case 2:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (-) вычитание: \n");
                        SubtractionOperation subtractionOperation = new SubtractionOperation();
                        try {
                            subtractionOperation.subtractionOperation(x, y, list);
                        } catch (RaisingToDegreeException e) {
                            System.out.println("ошибка: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (*) умножение: \n");
                        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
                        multiplicationOperation.multiplicationOperation(x, y, list);
                        break;
                    case 4:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (/) деление: \n");
                        DevisionOperation devisionOperation = new DevisionOperation();
                        try {
                            devisionOperation.devisionOperation(x, y, list);
                        } catch (DivisionByNullException e) {
                            System.out.println("ошибка: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (^) возвединее в степень: \n");
                        RaisingToPower raisingToPower = new RaisingToPower();
                        try {
                            raisingToPower.raisingToPower(x, y, list);
                        } catch (RaisingToDegreeException e) {
                            System.out.println("ошибка: " + e.getMessage());
                        }
                        break;
                    case 6:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (замена значений X и Y): \n");
                        ChangeValues changeValues = new ChangeValues(list);
                        changeValues.changeValues(list);
                        break;
                    case 7:
                        Calculator calculator = new Calculator(list);
                        calculator.printList(list);
                        break;
                    case 8:
                        System.out.println("Вы выбрали операцию " + operationNumber + " (Вывод операций калькулятора): \n");
                        System.out.println("Вы выбрали операцию " + operationNumber + " (Выход): \n");
                        exit();
                        break;
                    default:
                        System.out.println("Ошибка ввода! Вы ввели неправильные данные! ");
                        break;
                }
            }
        }
    }
}
