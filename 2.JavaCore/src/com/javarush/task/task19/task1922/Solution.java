package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception{

        int count;

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        consoleReader.close();

        while(fileReader.ready()){
            count = 0;
            String tmp;
            tmp = fileReader.readLine();

            String[] arr = tmp.split(" ");

            for(String s: arr){
                for(String word: words) {
                    if (s.equals(word)) {
                        count++;
                    }
                }
            }
            if(count == 2){
                System.out.println(tmp);
            }
        }
        fileReader.close();
    }
}
