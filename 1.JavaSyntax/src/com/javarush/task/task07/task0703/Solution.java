package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sMas = new String[10];
        int[] iMas = new int[10];

        for(int i = 0; i < sMas.length; i++){
            sMas[i] = br.readLine();
            iMas[i] = sMas[i].length();
        }
        for(int i = 0; i < iMas.length; i++)
            System.out.println(iMas[i]);

    }
}