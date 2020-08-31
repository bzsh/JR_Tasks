package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pos = 0;
        int neg = 0;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a > 0 && a != 0) pos++;
        if(a < 0 && a != 0) neg++;
        if(b > 0 && b != 0) pos++;
        if(b < 0 && b != 0) neg++;
        if(c > 0 && c != 0) pos++;
        if(c < 0 && c != 0) neg++;

        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);

    }
}
