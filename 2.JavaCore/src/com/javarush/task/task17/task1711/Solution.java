package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch(args[0]){
            case("-c") : synchronized (allPeople){createPerson(args);}
                break;
            case("-u") : synchronized (allPeople){updatePerson(args);}
                break;
            case("-d") : synchronized (allPeople){deletePerson(args);}
                break;
            case("-i") : synchronized (allPeople){printPeerson(args);}
                break;
        }
    }
    public static void createPerson (String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        int count = 1;
      while(count < args.length){
          Person p;
          switch(args[count + 1]){
              case ("м") : p = Person.createMale(args[count], sdf.parse(args[count + 2]));
              allPeople.add(p);
                  System.out.println(allPeople.indexOf(p));
                  break;
              case ("ж") :
                  p = Person.createFemale(args[count], sdf.parse(args[count + 2]));
                  allPeople.add(p);
                  System.out.println(allPeople.indexOf(p));
                  break;
          } count +=3;
      }
    }
    public static void updatePerson(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        int count = 1;
        while(count < args.length){
            Person p = allPeople.get(Integer.parseInt(args[count]));
            p.setName(args[count + 1]);
            switch(args[count + 2]){
                case("м") :
                    p.setSex(Sex.MALE);
                    break;
                case("ж") :
                    p.setSex(Sex.FEMALE);
                    break; }
                    p.setBirthDate(sdf.parse(args[count + 3]));
            count += 4;
        }
    }
    public static void deletePerson(String[] args){
        int count = 1;
        while(count < args.length){
            Person p = allPeople.get(Integer.parseInt(args[count]));
            p.setName(null);
            p.setSex(null);
            p.setBirthDate(null);
            count ++;
        }

    }
    public static void printPeerson(String[] args){
        SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String bs = " ";
        int count = 1;
        while(count < args.length){
            Person p = allPeople.get(Integer.parseInt(args[count]));
            String sex = p.getSex() == Sex.MALE ? "м" : "ж";
            System.out.println(p.getName() + bs + sex + bs + date.format(p.getBirthDate()));
            count ++;
        }
    }

}
