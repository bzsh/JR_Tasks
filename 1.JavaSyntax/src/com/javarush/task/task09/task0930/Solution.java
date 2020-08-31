package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> dig = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        for(String a : array ){
            if(isNumber(a)) dig.add(Integer.parseInt(a));
            else str.add(a);
        }
        Collections.sort(dig);
        Collections.reverse(dig);
        for(int i = str.size()-1; i > 0; i--){
            for(int j = 0; j < i; j++ ){
                if(isGreaterThan(str.get(j),str.get(j+1))){
                    Collections.swap(str,j,j+1);
                }
            }
        }
        Iterator<Integer> itd = dig.iterator();
        Iterator<String> its = str.iterator();
        for(int i = 0; i < array.length;i++){
            if(isNumber(array[i])) array[i] = itd.next().toString();
            else array[i] = its.next();
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
