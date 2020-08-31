package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception{
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(consoleReader.readLine());
        load(fis);

    }

    public void save(OutputStream outputStream) throws Exception {
        Properties property = new Properties();
        property.putAll(properties);
        property.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties property = new Properties();
        property.load(inputStream);
        for(Map.Entry entry : property.entrySet()){
            properties.put(entry.getKey().toString(), entry.getValue().toString());
        }


    }

    public static void main(String[] args) {

    }
}
