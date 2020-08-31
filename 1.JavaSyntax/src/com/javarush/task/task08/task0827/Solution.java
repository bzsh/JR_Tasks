package com.javarush.task.task08.task0827;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String h = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        try {
            Date d = sdf.parse(date);
            SimpleDateFormat sdf2 = new SimpleDateFormat("D");
              h = sdf2.format(d.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        int days =Integer.parseInt(h);
        if(days % 2 == 0) return false;
        else return true;
    }
}
