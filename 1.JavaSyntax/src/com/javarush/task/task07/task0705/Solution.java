package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[]mas = new int[20];
        int[]mas1 = new int[10];
        int[]mas2 = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0;i < mas.length;i++){
            mas[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < mas.length;i++){
            if(i < mas1.length){
                mas1[i] = mas[i];
            }else{
                mas2[i-mas2.length] = mas[i];
            }
        }
        for (int i = 0; i < mas2.length; i++){
            System.out.println(mas2[i]);
        }
    }
}
