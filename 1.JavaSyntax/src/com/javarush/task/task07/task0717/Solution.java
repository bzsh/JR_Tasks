package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList<>();

        for(int i = 0; i < 10; i++) list.add(br.readLine());

        ArrayList<String> result = doubleValues(list);

        for (String o : result) {
            System.out.println(o);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0; i < list.size();i++){
            list.add(i, list.get(i));
            i++;
        }
        return list;
    }
}
