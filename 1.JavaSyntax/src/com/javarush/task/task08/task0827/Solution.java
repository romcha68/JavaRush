package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)throws Exception {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(df.parse(date));
        System.out.print(date + " = ");
        return calendar.get(GregorianCalendar.DAY_OF_YEAR) % 2 != 0;
    }
}

