package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(console);
        List<Integer> digitList = new ArrayList<>();
        List<String> symbolList = new ArrayList<>();
        String[] str = result.split("[\\s]");
        for(int i = 0; i < str.length; i++){
            if(str[i].matches("(.*)\\d(.*)")) digitList.add(Integer.parseInt(str[i]));
            else symbolList.add(str[i]);
        }
        Iterator<Integer> integerIterator = digitList.iterator();
        Iterator<String> stringIterator = symbolList.iterator();
        int amount  = 0;

        while(integerIterator.hasNext()){
            int i = integerIterator.next();
            if(stringIterator.hasNext()) {
                if (integerIterator.hasNext()) {
                    String s = stringIterator.next();
                    if (s.equals("+")) amount = i + integerIterator.next();
                    if (s.equals("-")) amount = i - integerIterator.next();
                    if (s.equals("*")) amount = i * integerIterator.next();
                }
            }break;
}
        System.out.println(result + amount);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

