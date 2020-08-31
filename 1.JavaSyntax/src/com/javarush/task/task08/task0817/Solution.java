package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("asd","aaa");
        map.put("das","sss");
        map.put("sda","ddd");
        map.put("qwe","fff");
        map.put("ewq","ggg");
        map.put("weq","vvv");
        map.put("zxc","ccc");
        map.put("cxz","ddd");
        map.put("xcz","fff");
        map.put("xzc","ddd");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        HashMap<String, String> copy2 = new HashMap<>(map);
        int copyCount = 0;
        String str = null;
        for(String i: copy.values()){
            copyCount = 0;
            for(String j: copy2.values())if(i.equals(j)) copyCount++;
            if(copyCount >= 2){
                str = i;
                removeItemFromMapByValue(map,str);
                copy2 = new HashMap<>(map);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
