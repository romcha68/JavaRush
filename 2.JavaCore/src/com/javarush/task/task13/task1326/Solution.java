package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;



public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(bufferedReader.readLine());
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        ArrayList<Integer> list = new ArrayList<>();
        byte[] buffer = new byte[1024];

        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
            result.toString();
        }

        String[] subStr;
        subStr = result.toString().split(System.lineSeparator()); // Разделения строки str с помощью метода split()
        // Вывод результата на экран
        for (int i = 0; i < subStr.length; i++) {

            try {
                Integer number = Integer.parseInt(subStr[i]);

                if(number % 2 == 0){
                    list.add(number);
                }


            } catch (NumberFormatException e) {
                //System.out.println("No format");
            }
        }
        Collections.sort(list);
        for(Integer lists: list){
        System.out.println(lists);}
        inputStream.close();
    }
    }



