package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a <= 0 || b <= 0) throw new Exception();

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        ArrayList<Integer> nods = new ArrayList<>();

        for (int i = 1; i <= a; i++){
            if(a % i == 0) {
                listA.add(i);
            }
        }
        for (int i = 1; i <= b; i++){
            if(b % i == 0) {
                listB.add(i);
            }
        }

        for(Integer la : listA){
            for(Integer lb : listB){
                if(la.equals(lb)){
                    nods.add(la);}
            }
        }
         Collections.reverse(nods);
        System.out.println(nods.get(0));

    }
}
