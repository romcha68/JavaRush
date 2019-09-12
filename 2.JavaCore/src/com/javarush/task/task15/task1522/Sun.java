package com.javarush.task.task15.task1522;

/**
 * Created by User on 11.09.2019.
 */
public class Sun implements Planet{
    private Sun(){}
    private static Sun instance;
    public static Sun getInstance(){
        return instance = GetSun.instance;
    }
    public static class GetSun{
        private static final Sun instance = new Sun();
    }
}
