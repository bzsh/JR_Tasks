package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<FileInputStream> list = new ArrayList<>();
        boolean b = true;
        String s = "";

        while(b){
            try{s = br.readLine();}
            catch(IOException e){}
            try{
                FileInputStream f = new FileInputStream(s);
                list.add(f);}
            catch(FileNotFoundException e){
                System.out.println(s);

               try{ br.close();
                for(FileInputStream fis: list) fis.close();}
                catch(IOException ee){}
                b = false;
            }


        }
    }
}
