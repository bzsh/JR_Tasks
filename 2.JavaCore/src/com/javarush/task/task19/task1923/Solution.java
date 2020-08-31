package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));

        while (fileReader.ready()) {
            String temp = fileReader.readLine();
            String[] arr = temp.split(" ");
            for (String s : arr) {
                if (s.matches(".*\\d.*")) {
                    fileWriter.write(s + " ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
