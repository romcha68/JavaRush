package com.javarush.task.task14.task1417;

/**
 * Created by User on 06.02.2019.
 */
public class USD extends Money {
    public String getCurrencyName(){
        return "USD";
    }
    public USD(double amount){
        super(amount);
    }
}
