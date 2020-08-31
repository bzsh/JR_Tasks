package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url = br.readLine();

        ArrayList<String> str = new ArrayList<>();

        url = url.split("\\?")[1];

        String[] a = url.split("&");

        for(String s : a) {
            if(s.contains("=")){
                System.out.print(s.split("=")[0] + " ");
                if(s.contains("obj")){
                    str.add(s.split("=")[1]);
                }

        }else System.out.print(s + " ");
        }

        for(String s : str){
                try {
                    System.out.println();
                    alert(Double.parseDouble(s));
                }catch(Exception e){
                    System.out.println();
                    alert(s);
                }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
