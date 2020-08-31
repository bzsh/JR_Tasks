package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {

    public int[] mas = new int[5];

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        s.type();
        s.sort();
        s.show();
    }
    public void type() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < mas.length; i++){
            mas[i] = Integer.parseInt(reader.readLine());
        }
    }
    public void sort (){
        for(int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length-1; j++) {
                if (mas[i] > mas[j + 1]) {
                    int temp = mas[i];
                    mas[i] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
    }
    public void show () {
        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }
    }
}
