package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] c = s.toCharArray();
        for(int i = 0; i < 40; i++){
            for(int j = i; j < c.length; j++){
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }

}

