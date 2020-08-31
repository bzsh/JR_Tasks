package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        double max = 0;
        String line;
        String name;
        double money;

        if (fileReader.ready()) {
            line = fileReader.readLine();
            name = line.split(" ")[0];
            money = Double.parseDouble(line.split(" ")[1]);
            map.put(name, money);
        }

        while (fileReader.ready()) {
            line = fileReader.readLine();
            name = line.split(" ")[0];
            money = Double.parseDouble(line.split(" ")[1]);
            if (map.containsKey(name)) {
                money = money + map.get(name);
                map.put(name, money);
            } else {
                map.put(name, money);
            }
        }
        fileReader.close();
        for (Map.Entry entry : map.entrySet()) {
            double temp = Double.parseDouble(entry.getValue().toString());
            if (temp > max) {
                max = temp;
            }
        }
        TreeMap<String, Double> tempMap = new TreeMap<>();
        for (Map.Entry entry : map.entrySet()){
            double temp = Double.parseDouble(entry.getValue().toString());
            if(temp == max){
                tempMap.put(entry.getKey().toString(), temp);
            }
        }

            tempMap.forEach((k, v) -> System.out.println(k));


    }
}