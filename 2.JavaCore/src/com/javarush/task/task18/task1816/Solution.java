package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Людмила\\Desktop\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1816\\1.txt");
        byte[] bytes = new byte[fis.available()];
        fis.read(bytes);
        int count = 0;
        for(byte b: bytes){
            if((b >= 65 && b <= 90) || (b >= 97 && b <= 122)) count++;
        }
        System.out.println(count);
        fis.close();
    }
}
