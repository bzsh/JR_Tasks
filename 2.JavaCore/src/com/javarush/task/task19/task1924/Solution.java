package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/


public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws Exception {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));

        while (fileReader.ready()) {
            String[] arr = fileReader.readLine().split(" ");
            for (String s : arr) {
                if (s.matches("\\d\\d|\\d")) {
                    int d = Integer.parseInt(s);
                    if (d >= 0 && d <= 12) System.out.print(map.get(d) + " ");
                    else System.out.print(s + " ");
                } else System.out.print(s + " ");
            }
            System.out.println();
        }
        consoleReader.close();
        fileReader.close();
    }
}
