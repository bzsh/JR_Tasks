package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 1;
        int count2 = 1;
        for(int i = 0; i<10; i++){
            list.add(i, Integer.parseInt(br.readLine()));
        }

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                count2 ++;
                if(count2>count)count = count2;
            }else count2 = 1;
        }
        System.out.println(count);
    }
}