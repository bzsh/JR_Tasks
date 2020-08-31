package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        String name = reader.readLine();
        //int nYear = Integer.parseInt(sYear);
        System.out.println(name + " захватит мир через " + sYear + " лет. Му-ха-ха!");
    }
}
