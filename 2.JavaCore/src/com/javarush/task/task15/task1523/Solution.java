package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }
    private Solution(String s, int a){
    }
    public Solution(int a, String s){}
    protected Solution(int a, int b){}
    Solution(String s, String g){}
}

