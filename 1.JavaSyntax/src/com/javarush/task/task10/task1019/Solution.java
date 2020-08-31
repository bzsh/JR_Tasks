package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id = 0;
        String name = null;

        while(true) {
            String i = reader.readLine();
            if(i.equals(""))break;
            id = Integer.parseInt(i);
            name = reader.readLine();
            map.put(name, id);
        }
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
