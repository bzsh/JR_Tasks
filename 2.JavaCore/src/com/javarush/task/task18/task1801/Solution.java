package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        int max = 0;
        FileInputStream fr = new FileInputStream(fileName);
        while(fr.available() > 0){
            int i = fr.read();
            if(i > max) max = i;
        }
        br.close();
        fr.close();
        System.out.println(max);
    }
}
