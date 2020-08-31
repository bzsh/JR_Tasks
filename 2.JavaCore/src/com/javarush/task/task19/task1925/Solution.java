package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) throws Exception {

        String one = args[0];
        String two = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(one));
        BufferedWriter writer = new BufferedWriter(new FileWriter(two));

        int count = 0;
        String str;
        StringBuilder sb = new StringBuilder();

        while (reader.ready()) {
            sb.append(reader.readLine());
            sb.append(" ");
        }

        str = sb.toString();

        String[] arr = str.split("\\s");

        for (String s : arr) {
            if (s.length() > 6) {
                if (count != 0) {
                    writer.write(",");
                }
                writer.write(s);
                count++;
            }
        }
        reader.close();
        writer.close();
    }
}

