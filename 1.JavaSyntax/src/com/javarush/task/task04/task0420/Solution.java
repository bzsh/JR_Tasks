package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a >= b && a >= c){
            System.out.print(a);
            if(b >= c){
                System.out.print(" " + b + " " + c);
            }else {
                System.out.print(" " + c + " " + b);
            }

        } else
        if(b >= a && b >= c){
            System.out.print(b);
            if(a >= c){
                System.out.print(" " + a + " " + c);
            }else {
                System.out.print(" " + c + " " + a);
            }

        } else
        if(c >= a && c >= b){
            System.out.print(c);
            if(a >= b){
                System.out.print(" " + a + " " + b);
            }else {
                System.out.print(" " + b + " " + a);
            }

        }


    }
}
