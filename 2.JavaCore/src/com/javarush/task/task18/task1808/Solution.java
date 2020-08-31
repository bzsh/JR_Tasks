package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(br.readLine());
        FileOutputStream file2 = new FileOutputStream(br.readLine());
        FileOutputStream file3 = new FileOutputStream(br.readLine());
         //int d = file1.available() - (file1.available() / 2);
        byte[] buf2 = new byte[file1.available()/2];
        byte[] buf1 = new byte[(file1.available()) - (file1.available() / 2)];



                if(file1.available() > 0){
                    int count = file1.read(buf1);
                    file2.write(buf1, 0, count);
                    count = file1.read(buf2);
                    file3.write(buf2, 0, count);
                }

            br.close();
            file1.close();
            file2.close();
            file3.close();


    }
}
