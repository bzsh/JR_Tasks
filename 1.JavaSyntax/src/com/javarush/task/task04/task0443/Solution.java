package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.List;
import java.util.ListIterator;

public abstract class Solution {
    static int y;
    static int m;
    static int d;
    static String name;


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        name = br.readLine();
        y = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
    public abstract void show ();


    public  class Ror  {



    }
}
