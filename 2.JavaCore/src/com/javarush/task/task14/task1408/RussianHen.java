package com.javarush.task.task14.task1408;

/**
 * Created by User on 18.12.2018.
 */
public class RussianHen extends Hen implements Country{
    String country = RUSSIA;
    public int getCountOfEggsPerMonth(){
        return 10;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() +
                " яиц в месяц.";
    }
}
