package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        int count = 0;
        while(fis.available() > 0){
            if(fis.read() == 44) count++;
        }
        System.out.println(count);
        br.close();
        fis.close();
    }
}
