package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }
        catch (Exception e){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();

    }

    //add your code here - добавьте код тут


    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;
        private String fileContent = "";
        public void setFileName(String fullFileName){
            fileName = fullFileName;
        }
        public String getFileContent(){
            return fileContent;
        }
        public void run(){
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName)));
                while ((this.fileName = bufferedReader.readLine()) != null) {
                    this.fileContent += this.fileName + " ";
                }
                bufferedReader.close();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
