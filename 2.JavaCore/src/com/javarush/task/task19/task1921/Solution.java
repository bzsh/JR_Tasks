package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String name;
        String date;
        while (br.ready()) {
            String line = br.readLine();
            name = line.replaceAll("\\d", "").trim();
            date = line.replaceAll(name, "").trim();
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy", Locale.US);
            PEOPLE.add(new Person(name, sdf.parse(date)));
        } br.close();
    }
}