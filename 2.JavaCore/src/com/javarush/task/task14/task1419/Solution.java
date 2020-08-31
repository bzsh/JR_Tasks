package com.javarush.task.task14.task1419;

import java.awt.*;
import java.io.FileReader;
import java.io.ObjectStreamException;
import java.io.Reader;
import java.security.KeyException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;
import java.util.zip.DataFormatException;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {float i = 1 / 0;}
        catch (Exception e){exceptions.add(e);}

        try{String n = null;
            System.out.println(n.toUpperCase());}
        catch(Exception e){exceptions.add(e);}

        try{Reader fr = new FileReader("123");}
        catch(Exception e){exceptions.add(e);}

        try{throw new RuntimeException();}
        catch(Exception e){exceptions.add(e);}

        try{throw new IllegalAccessException();}
        catch(Exception e){exceptions.add(e);}

        try{throw new ParseException("dg",6); }
        catch(Exception e){exceptions.add(e);}

        try{throw new KeyException();}
        catch(Exception e){exceptions.add(e);}

        try{throw new JarException(); }
        catch(Exception e){exceptions.add(e);}

        try{throw new HeadlessException(); }
        catch(Exception e){exceptions.add(e);}

        try{throw new DataFormatException(); }
        catch(Exception e){exceptions.add(e);}
    }
}
