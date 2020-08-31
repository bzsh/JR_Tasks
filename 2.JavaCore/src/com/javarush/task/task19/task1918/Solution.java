package com.javarush.task.task19.task1918;

/*
Знакомство с тегами
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String path = consoleReader.readLine();
        consoleReader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String a ;

        String startTag = "<" + args[0];
        String endTag = "</" + args[0] + ">";
        int startIndex ;
        int endIndex ;
        int tempStartIndex = 0;
        StringBuilder sb = new StringBuilder();

        while(fileReader.ready()){
            sb.append(fileReader.readLine());
        }
        fileReader.close();

        a = sb.toString();

        while(tempStartIndex != -1){

            startIndex = a.indexOf(startTag, tempStartIndex);

            if(startIndex == -1) break;

            endIndex = a.indexOf(endTag, startIndex);

            tempStartIndex = a.indexOf(startTag, startIndex + 1);

            if(tempStartIndex < endIndex && tempStartIndex != -1){
                endIndex = a.indexOf(endTag, endIndex + 1);
            }
            System.out.println(a.substring(startIndex, endIndex + endTag.length()));
        }
    }
}