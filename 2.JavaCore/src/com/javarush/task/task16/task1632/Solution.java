package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread(new ThreadOne()));
        threads.add(new Thread(new ThreadTwo()));
        threads.add(new Thread(new ThreadThree()));
        threads.add(new ThreadFor());
        threads.add(new Thread(new ThreadFive()));
    }
    public static class ThreadOne extends Thread{
        public void run(){
            while (true){
            }
        }
    }
    public static class ThreadTwo extends Thread{
        public void run(){
            try {
                sleep(0);
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThreadThree extends Thread{
        @Override
        public void run(){
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    public static class ThreadFor extends Thread implements Message{
        @Override
        public void showWarning(){
            this.interrupt();
        }
        @Override
        public void run(){
            while (!this.isInterrupted()){}
        }
    }
    public static class ThreadFive extends Thread{

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;

        public void run() {
            try {
                for (String s = reader.readLine(); !s.equals("N"); s = reader.readLine()) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.getMessage();
            }
        }
        }


    public static void main(String[] args) {

    }
}