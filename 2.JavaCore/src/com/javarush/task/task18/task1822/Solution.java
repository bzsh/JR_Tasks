package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(name.readLine())));
        while(br.ready()) {
            String s = br.readLine();
            if(s.startsWith(args[0] + " ")) System.out.println(s);
        }
        name.close();
        br.close();



    }

}
