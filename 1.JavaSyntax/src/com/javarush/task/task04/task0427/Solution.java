package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String u = br.readLine();
        int a = Integer.parseInt(u);
        int b = u.length();

        if (a > 0 && a <= 999) {
            if (a % 2 == 0) System.out.print("четное");
            else System.out.print("нечетное");
            if(b == 1) System.out.print(" однозначное число");
            if(b == 2) System.out.print(" двузначное число");
            if(b == 3) System.out.print(" трехзначное число");
        }


    }
}
