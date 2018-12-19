package com.javarush.task.task14.task1408;

/**
 * Created by User on 18.12.2018.
 */
public class BelarusianHen extends Hen implements Country{
    public int getCountOfEggsPerMonth(){
    return 20;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }
}
