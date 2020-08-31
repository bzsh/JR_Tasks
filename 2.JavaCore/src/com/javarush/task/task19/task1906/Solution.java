package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = br.readLine();
        String fileTwo = br.readLine();
        br.close();

        FileReader reader = new FileReader(fileOne);
        FileWriter writer = new FileWriter(fileTwo);
        int count = 1;

        while(reader.ready()){
            int i = reader.read();
            if(count % 2 == 0) writer.write(i);
            count++;
        }
        reader.close();
        writer.close();
    }
}
