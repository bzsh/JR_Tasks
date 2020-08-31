package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //boolean isThousand = true;
        try{

        while(true){
            FileInputStream fis = new FileInputStream(br.readLine());
            if(fis.available() < 1000){
                //isThousand = false;
                br.close();
                fis.close();
                throw new DownloadException();
            }
        }
        }
        catch(IOException e){}

    }

    public static class DownloadException extends Exception {

    }
}
