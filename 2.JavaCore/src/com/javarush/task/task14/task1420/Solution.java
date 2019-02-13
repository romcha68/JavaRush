package com.javarush.task.task14.task1420;

/* 
НОД
*/
// remainder = bigger/smaller
// remainder == 0  =>  result = smaller
// bigger = smaller  smaller = remainder

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.println(algorithmEuclidium(a, b));

        if (a <= 0) throw new Exception();
        if (b <= 0) throw new Exception();

    }

    public static int algorithmEuclidium(int a, int b) {
        int bigger;
        int smaller;
        int remainder;
        if (a > b) {
            bigger = a;
            smaller = b;
        } else {
            bigger = b;
            smaller = a;
        }
        while (smaller != 0) {
            remainder = bigger % smaller;
            bigger = smaller;
            smaller = remainder;
        }
        return bigger;
    }
}
