package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        labels.put(1.1, "bca");
        labels.put(1.2, "abc");
        labels.put(1.3, "cba");
        labels.put(1.4, "bac");
        labels.put(1.5, "cab");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
