package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String fileName = br.readLine();
        boolean i = true;
        List<String> list = new ArrayList<>();


        while(i){
            a = br.readLine();
            list.add(a);
            if(a.contains("exit")) i = false;
        }

        File file = new File(fileName + ".txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for(String o: list){
            bw.write(o + "\n");
        }
        br.close();
        bw.close();
    }
}
