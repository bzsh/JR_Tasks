package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] mas = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 8; i++){
            mas[i] = br.readLine();
        }

        for(int i = 10; i !=0; i--){
            System.out.println(mas[i-1]);
        }

    }
}