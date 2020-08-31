package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a != 0) {
            if (a > 0) System.out.println("положительное");
            else System.out.println("отрицательное");
            if (a % 2 == 0) System.out.print(" четное число");
            else System.out.print(" нечетное число");
        } else System.out.println("ноль");

    }




}

