package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        firstFileName = br.readLine();
        secondFileName = br.readLine();
            br.close();
        }catch(IOException e){
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
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String content = "";
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return this.content;
        }

        @Override
        public void run() {
            try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
                while(br.ready()){
                    content += br.readLine() + " ";
                }
                br.close();

            }catch(Exception e){
            }
        }
    }
}
