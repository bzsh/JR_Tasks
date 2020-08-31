package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int shrt = 0;
        int lng = 0;
        int max ;
        int min ;

        for (int i = 0; i < 10; i++){
            list.add(br.readLine());
        }
        min = list.get(0).length();
        max = list.get(0).length();

        for (int i = 0; i < list.size();i++){
            if(list.get(i).length() > max){
                max = list.get(i).length();
                lng = i;
            }else if(list.get(i).length() < min){
                min = list.get(i).length();
                shrt = i;
            }
        }
        if (lng > shrt){
            System.out.println(list.get(shrt));
        }else{
            System.out.println(list.get(lng));
        }
    }
}
