package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        int count = 0;
        String result = "";

        FileReader reader = new FileReader(fileName);
        BufferedReader br1 = new BufferedReader(reader);
        while(br1.ready()){
            String[] str = br1.readLine().split("[^a-zA-Z0-9]");
            for(String s: str){
                if(s.equals("world")){
                    count++;
                }
            }
        }
        reader.close();
        br1.close();
        System.out.println(count);
    }
}
