package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args)throws IOException {
        //add your code here
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int indexM = string.indexOf("?");
        String string1 = string.substring(indexM+1);
        ArrayList<String> Obj = new ArrayList();
        //  System.out.println(s2);
        //str = s2.split("&")

        for (String retval : string1.split("&")) {
            int index = retval.indexOf("=");
            if (index!=-1)
            {
                String param = retval.substring(0, index);
                System.out.print(param);
                if (param.equals("obj"))
                    Obj.add(retval.substring(index+1));

            }
            else
                System.out.print(retval );
            System.out.print(" ");
        }

        for (int i = 0; i < Obj.size() ; i++)
        {
            // temp =Obj.get(i);
            //obj
            try {
                double number = Double.parseDouble( Obj.get(i));
                alert(number);

            } catch (NumberFormatException e) {
                alert(Obj.get(i));
                //System.err.println("Неверный формат строки!");
            }

        }

    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
