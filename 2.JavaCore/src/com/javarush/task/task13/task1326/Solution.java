package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(br.readLine());
        Scanner sc = new Scanner(fis);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            int i = sc.nextInt();
            if(i % 2 == 0) list.add(i);
        }
        Collections.sort(list);
        for(Integer i : list) System.out.println(i);
        br.close();
        fis.close();
        sc.close();
    }
}
