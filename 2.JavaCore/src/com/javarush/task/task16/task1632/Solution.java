package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static{
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {
    }

    public static class ThreadOne extends Thread {

        public void run() {
            while(true){}
        }
    }

    public static class ThreadTwo extends Thread {

        public void run() {
            while(true){
            try{sleep(100);
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
            }
        }
    }

    public static class ThreadThree extends Thread {
        public void run() {
       while(true){
           try{
               System.out.println("Ура");
           sleep(500);
           }catch(InterruptedException e){}
       }
    }
    }

    public static class ThreadFour extends Thread implements Message {
        @Override
        public void run() {
            while(!isInterrupted()){}
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class ThreadFive extends Thread {
        @Override
        public void run() {
            ArrayList<Integer>list = new ArrayList<>();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String n = "";
            while(true){
                try{
                n = br.readLine();
                list.add(Integer.parseInt(n));
                }catch(Exception e){
                    if(n.equals("N")){
                        int sum = 0;
                        try {
                            br.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        for(Integer i: list){
                            sum += i;
                        }
                        System.out.println(sum);
                        break;
                    }
                }
            }
        }
    }
}
