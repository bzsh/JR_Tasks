package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Hfjghkg",df.parse("JANUARY 2 1985"));
        map.put("Zjflkjf",df.parse("MARCH 5 1989"));
        map.put("Tdfg",df.parse("OCTOBER 4 2001"));
        map.put("Udsjf",df.parse("JUNE 1 1999"));
        map.put("Rsdf",df.parse("AUGUST 6 2000"));
        map.put("Wdfg",df.parse("DECEMBER 3 1999"));
        map.put("Rcfbf",df.parse("DECEMBER 7 1998"));
        map.put("Tdfhfh",df.parse("DECEMBER 6 1996"));
        map.put("Vdfgdf",df.parse("DECEMBER 4 1995"));
            return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        DateFormat df = new SimpleDateFormat("MM");
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            int month = Integer.parseInt(df.format(iterator.next().getValue().getTime()));
            if (month >= 6 && month <= 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
}
}
