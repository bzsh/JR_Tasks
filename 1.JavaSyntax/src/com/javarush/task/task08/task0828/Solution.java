package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String y = br.readLine();
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"");
        list.add(0, "December");
        list.add(0, "November");
        list.add(0, "October");
        list.add(0, "September");
        list.add(0, "August");
        list.add(0, "July");
        list.add(0, "June");
        list.add(0, "May");
        list.add(0, "April");
        list.add(0, "March");
        list.add(0, "February");
        list.add(0, "January");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (y.toUpperCase().equals(it.next().toUpperCase())) {
                int i = list.indexOf(it.next());
                System.out.println(y + " is the " + i + " month");
            }
        }
    }
}

