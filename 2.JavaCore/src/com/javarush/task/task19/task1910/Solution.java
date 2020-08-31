package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        reader.close();
        BufferedReader bfr = new BufferedReader(new FileReader(fileOne));
        BufferedWriter bfw = new BufferedWriter(new FileWriter(fileTwo));

        while(bfr.ready()){
            String s;
            s = bfr.readLine().replaceAll("[^a-zA-Z0-9а-яА-Я\\s[\\n]]","");
            bfw.write(s);
        }
        bfr.close();
        bfw.close();
    }
}
