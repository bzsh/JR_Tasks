package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        byte[] buf = new byte[fis.available()];
        fis.read(buf);
        fis.close();
        int[] simbol = new int[256];
        for(byte b: buf){
            simbol[b]++;
        }
        for(int i = 0; i < simbol.length; i++){
            if(simbol[i] > 0) System.out.println((char)i + " " + simbol[i]);
        }

    }
}
