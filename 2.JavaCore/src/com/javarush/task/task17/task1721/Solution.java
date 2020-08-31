package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String fileNameOne = null;
        String fileNameTwo = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileNameOne = br.readLine();
            fileNameTwo = br.readLine();
            br.close();
        }
        catch(IOException e){
        }
        try {
            BufferedReader fbrOne = new BufferedReader(new FileReader(fileNameOne));
            BufferedReader fbrTwo = new BufferedReader(new FileReader(fileNameTwo));
            String line = null;
            while((line = fbrOne.readLine()) != null){
                allLines.add(line);
            }
            while((line = fbrTwo.readLine()) != null){
                forRemoveLines.add(line);
            }
            fbrOne.close();
            fbrTwo.close();
        }catch(Exception e){}
        try{
        new Solution().joinData();}catch(CorruptedDataException e){}


    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
