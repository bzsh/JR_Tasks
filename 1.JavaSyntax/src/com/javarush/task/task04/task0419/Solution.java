package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if(a >= b){
            if(a >= c){
                if(a >= d){
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }

            } else {
                if(c >= d){
                    System.out.println(c);
                } else {
                    System.out.println(d);
                }
            }
        } else {
            if(b >= c){
                if(b >= d){
                    System.out.println(b);
                } else {
                    System.out.println(d);
                }
            } else {
                if(c >= d){
                    System.out.println(c);
                } else {
                    System.out.println(d);
                }
            }
        }
    }
}
