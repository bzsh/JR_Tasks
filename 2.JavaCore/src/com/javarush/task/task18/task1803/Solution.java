package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        int[] arr = new int[256];
        while(fis.available() > 0) arr[fis.read()]++;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) System.out.print(i + " ");
        }
        br.close();
        fis.close();
    }
}
