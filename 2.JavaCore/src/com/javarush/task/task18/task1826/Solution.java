package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
         crypto(args[0],args[1],args[2],144);
    }

    public static void crypto (String code, String fileName, String fileOutputName, int key)throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);
        switch(code){
            case "-e":{
                while(fis.available() > 0){
                    fos.write(fis.read()^key);
                }
            }
            case "-d":{
                while(fis.available() > 0){
                    fos.write(fis.read()^key);
                }
            }
        }
        fis.close();
        fos.close();
    }
}
