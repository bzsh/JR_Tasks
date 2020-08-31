package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(br.readLine());
        FileOutputStream file2 = new FileOutputStream(br.readLine());
        byte[] buf1 = new byte[file1.available()];

            file1.read(buf1);
        for(int i = buf1.length-1; i >= 0; i--)
            file2.write(buf1[i]);

        br.close();
        file1.close();
        file2.close();
        }
    }

