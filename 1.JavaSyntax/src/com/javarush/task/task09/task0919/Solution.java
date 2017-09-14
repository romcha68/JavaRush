package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void divisionByZero(){
        System.out.println(25/0);
    }
}
