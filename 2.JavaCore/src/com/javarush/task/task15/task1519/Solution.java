package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String value = scanner.nextLine();
            if (value.equals("exit")) {
                break;
            }
                try {if(value.contains(".")){
                    print(Double.parseDouble(value));
                }
                    else if(Integer.parseInt(value) >= 128 || Integer.parseInt(value) <= 0){
                      {
                        print(Integer.parseInt(value));}
                    }
                    else {
                        short shortNumber = (short) Integer.parseInt(value);
                        print(shortNumber);
                    }
                } catch (NumberFormatException e) {
                    print(value);
                }
            }
        }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
