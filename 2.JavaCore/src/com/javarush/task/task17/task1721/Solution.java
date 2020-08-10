package com.javarush.task.task17.task1721;

import sun.applet.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    static BufferedReader reader;
    static String path1;
    static String path2;

    static{
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            path1 = reader.readLine();
            path2 = reader.readLine();
            reader.close();
            allLines = Files.readAllLines(Paths.get(path1));
            forRemoveLines = Files.readAllLines(Paths.get(path2));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            new Solution().joinData();
        }catch (IOException e){

        }
        }

    public void joinData() throws CorruptedDataException, IOException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
