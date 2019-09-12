package com.javarush.task.task15.task1522;

/**
 * Created by User on 12.09.2019.
 */
public class Earth implements Planet{
    private Earth(){}
    private static Earth instance;
    public static Earth getInstance(){
        return instance = GetEarth.instance;
    }
    public static class GetEarth{
        private static final Earth instance = new Earth();
    }
}
