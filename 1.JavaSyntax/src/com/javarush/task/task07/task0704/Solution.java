package com.javarush.task.task07.task0704;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0;i < mas.length; i++)
            mas[i] = Integer.parseInt(br.readLine());

        for(int i = 10; i !=0; i--) System.out.println(mas[i-1]);

    }
}

