package ChangeValuesOfNumbersXY;

import Service.Service;

import java.util.ArrayList;

public class ChangeValues
{
    private ArrayList list;
    public ChangeValues(ArrayList list)
    {
        this.list = list;
    }
    public void changeValues(ArrayList list)
    {
        Service service = new Service(list);
        service.start(list);
    }
}
