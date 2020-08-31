package com.javarush.task.task08.task0829;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }
        //read city
        String city = reader.readLine();
        Iterator<String> it = addresses.iterator();

        while(it.hasNext()) {
            String a = it.next();
            if (city.toUpperCase().equals(a.toUpperCase()) && it.hasNext()){
                int i = addresses.indexOf(a);
                    if(i % 2 == 0) {
                        System.out.println(it.next());
                }
            }
        }
        }
    }


