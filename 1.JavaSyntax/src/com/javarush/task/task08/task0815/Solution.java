package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Алексеевь","Иоан");
        map.put("Алексеефф","Олег");
        map.put("Александров","Иоан");
        map.put("Иванов","Гена");
        map.put("федоров","Петр");
        map.put("Петров","игрь");
        map.put("Алексеев","игорь");
        map.put("Авдеев","Иванко");
        map.put("Алексееф","Ифан");
        map.put("Алегсеев","Ыван");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for(String i : map.values()){
            if(i.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for(String i : map.keySet()){
            if(i.equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
    }
}
