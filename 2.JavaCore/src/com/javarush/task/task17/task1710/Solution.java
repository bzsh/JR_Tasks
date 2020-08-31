package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if(args[0].equals("-c")){
            if(args[2].equals("м")){
                Person p = Person.createMale(args[1], sdf.parse(args[3]));
                allPeople.add(p);
                System.out.println(allPeople.indexOf(p));}
            else if(args[2].equals("ж")) {
                Person p = Person.createFemale(args[1], sdf.parse(args[3]));
                allPeople.add(p);
                System.out.println(allPeople.indexOf(p));}
        }
        if(args[0].equals("-u")){
           Person p = allPeople.get(Integer.parseInt(args[1]));
           p.setName(args[2]);
           if(args[3].equals("м")) p.setSex(Sex.MALE);
           if(args[3].equals("ж")) p.setSex(Sex.FEMALE);
           p.setBirthDate(sdf.parse(args[4]));
        }else if(args[0].equals("-d")){
            Person p = allPeople.get(Integer.parseInt(args[1]));
            p.setName(null);
            p.setSex(null);
            p.setBirthDate(null);

        }else if(args[0].equals("-i")){
            Person p = allPeople.get(Integer.parseInt(args[1]));
            String bs = " ";
            String sex = p.getSex() == Sex.MALE ? "м" : "ж";
            SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(p.getName() + bs + sex + bs + date.format(p.getBirthDate()));
        }

    }
}
