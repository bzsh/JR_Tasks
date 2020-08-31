package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = bufferedReader.readLine();
        String fileTwo = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader br = new BufferedReader(new FileReader(fileOne));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileTwo, true));

        while(br.ready()){
            String s;
            s = br.readLine().replaceAll("[.]", "!");
            bw.write(s);
        }
        br.close();
        bw.close();
    }
}
