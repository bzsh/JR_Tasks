package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        System.out.println(name + " получает " + sNum1 + " через " + sNum2 + " лет.");
    }
}
