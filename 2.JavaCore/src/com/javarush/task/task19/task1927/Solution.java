package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream systemOut = System.out;
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(arr);
        System.setOut(newOut);
        testString.printSomething();
        System.setOut(systemOut);
         String[] strArr = arr.toString().split("\\n");
         int count = 1;
         for(String s: strArr){
             System.out.println(s);
             if(count % 2 == 0){
                 System.out.println("JavaRush - курсы Java онлайн");
             }
             count++;
         }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
