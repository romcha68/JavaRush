package com.javarush.task.task15.task1522;

/**
 * Created by User on 12.09.2019.
 */
public class Moon implements Planet{
    private Moon(){}
    private static Moon instance;
    public static Moon getInstance(){
        return instance = GetMoon.instance;
    }
    public static class GetMoon{
        private static final Moon instance = new Moon();
    }
}
