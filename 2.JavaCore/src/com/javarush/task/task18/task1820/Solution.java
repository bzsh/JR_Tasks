package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();
        String file = "";
        String data = "";

        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));

        while(buf.ready()) {file = buf.readLine();}
        buf.close();

        StringBuilder sb = new StringBuilder();

        for(String s: file.split(" ")){
           sb.append(Math.round(Float.parseFloat(s))).append(" ");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
