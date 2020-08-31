package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream(args[0]);
        int a = fis.available();
        int b = 0;
        double result;
        byte[] buf = new byte[a];
        fis.read(buf);
        for(byte bb: buf){
            if(bb == 32) b++;
        }
        result = (double)b/(double)a*100;
        System.out.format("%.2f", result);
        fis.close();
    }
}
