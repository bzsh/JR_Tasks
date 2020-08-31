package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = br.readLine();
        String fileNameTwo = br.readLine();
        br.close();
        FileReader reader = new FileReader(fileNameOne);
        FileWriter writer = new FileWriter(fileNameTwo, true);
        BufferedReader bfr = new BufferedReader(reader);
        BufferedWriter bfw = new BufferedWriter(writer);
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        while(bfr.ready()){
            Matcher matcher = pattern.matcher(bfr.readLine());
            while(matcher.find()) bfw.write(matcher.group() + " ");
            }
        bfr.close();
        bfw.close();
    }
}
