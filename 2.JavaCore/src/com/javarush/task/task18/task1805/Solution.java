package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        int[] mas = new int[256];
        while(fis.available() > 0) mas[fis.read()] = 1;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] == 1) System.out.print(i + " ");
        }
        br.close();
        fis.close();
    }
}
