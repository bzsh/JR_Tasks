package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("qqq", 1000 );
        map.put("aaa", 100 );
        map.put("xxx", 600 );
        map.put("ccc", 1000 );
        map.put("vvv", 1000 );
        map.put("bbb", 1200 );
        map.put("ggg", 1000 );
        map.put("fff", 500 );
        map.put("ddd", 499 );
        map.put("sss", 501 );
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : copy.entrySet()){
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}