package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static  Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ReadThread> listOfTreads = new ArrayList<>();
        boolean b = true;
        while(b){
            String s = br.readLine();
            if(s.equals("exit")){
                b = false;
            }else{
                listOfTreads.add(new ReadThread(s));
            }
        }
        for(ReadThread rt: listOfTreads) rt.start();
    }

    public static class ReadThread extends Thread {
        private String name;
        public ReadThread(String fileName) {
             this.name = fileName;
        }

        @Override
        public void run()  {
            try{
            FileInputStream fis = new FileInputStream(name);

            byte[] buf = new byte[fis.available()];
            int[]symbol = new int[256];
            int max = 0;
            int index = 0;

            fis.read(buf);
            fis.close();

            for(byte b: buf) symbol[b]++;

            max = symbol[0];

            for(int i = 0; i < symbol.length; i++){
                if(symbol[i] > max) {
                    max = symbol[i];
                    index = i;
                }
            }
            resultMap.put(name, index);
            }
            catch(IOException e){
            }
        }
    }
}
