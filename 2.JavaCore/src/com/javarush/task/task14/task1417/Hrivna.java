package com.javarush.task.task14.task1417;

/**
 * Created by User on 06.02.2019.
 */
public class Hrivna extends Money{
    public String getCurrencyName(){
        return "UAH";
    }
    public Hrivna(double amount){
        super(amount);
    }
}
