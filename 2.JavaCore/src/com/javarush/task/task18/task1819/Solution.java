package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        int count = 0;
        byte[] buf1 = new byte[fis1.available()];
        byte[] buf2 = new byte[fis2.available()];
        byte[] buf = new byte[buf1.length + buf2.length];

        fis2.read(buf2);
        fis2.close();
        fis1.read(buf1);
        fis1.close();
        for(byte b: buf2){
            buf[count] = b;
            count++;
        }
        for(byte b: buf1){
            buf[count] = b;
            count++;
        }
        FileOutputStream fos1 = new FileOutputStream(file1);
        fos1.write(buf);
        fos1.close();
    }
}
