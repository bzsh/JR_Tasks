package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;
    public static int B = 5;

    static {
       A = Integer.parseInt("999999999999999999999999999999999999999999999999999999");
       B = B/A;
    }
    public static void main(String[] args) {
        System.out.println(B);
    }
}
