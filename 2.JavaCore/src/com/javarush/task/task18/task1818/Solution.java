package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(br.readLine());
        FileInputStream file2 = new FileInputStream(br.readLine());
        FileInputStream file3 = new FileInputStream(br.readLine());

        byte[] file2Buf = new byte[file2.available()];
        byte[] file3Buf = new byte[file3.available()];
        file2.read(file2Buf);
        file3.read(file3Buf);
        file1.write(file2Buf);
        file1.write(file3Buf);
        file1.close();
        file2.close();
        file3.close();

    }
}
