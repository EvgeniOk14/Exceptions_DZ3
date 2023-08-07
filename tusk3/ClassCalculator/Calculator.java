package ClassCalculator;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Calculator
{
    private ArrayList list = new ArrayList();
    public Calculator(ArrayList list)
    {
        this.list = list;
    }

    public void saveOperation(String input, double result)
    {
        list.add(input + result);
        System.out.println(list);
    }
    public void printList(ArrayList list)
    {
        System.out.println(list);
    }
}
