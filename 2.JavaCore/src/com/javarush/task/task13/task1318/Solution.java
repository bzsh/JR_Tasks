package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String i = br.readLine();
            InputStream is = new FileInputStream(i);
            BufferedInputStream bis = new BufferedInputStream(is);

            while(bis.available()>0){
                char ch = (char)bis.read();
                System.out.print(ch);
        }
        br.close();
            is.close();
            bis.close();
    }
}