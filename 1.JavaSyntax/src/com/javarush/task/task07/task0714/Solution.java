package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) list.add(br.readLine());
        list.remove(2);

        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < list.size();i++){
            list2.add(0, list.get(i));
        }
        for (String o : list2) {
            System.out.println(o);
        }
    }
}
