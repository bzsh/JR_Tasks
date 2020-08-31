package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String s = br.readLine();

        while(!"end".equals(s)){
            int i = Integer.parseInt(s.split("^.+(part)")[1]);
            map.put(i,s);
            list.add(i);
            s = br.readLine();
        }

        Collections.sort(list);
        FileInputStream fis;
        String path = map.get(list.get(0)).split("\\.(part\\d+$)")[0];
        FileOutputStream fos = new FileOutputStream(path, true);
        byte[] buf;

        for(Integer i : list){
            fis = new FileInputStream(map.get(i));
            buf = new byte[fis.available()];
            fis.read(buf);
            fos.write(buf);
            fis.close();
        }
        br.close();
        fos.close();
    }
}