package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }
        @Override
        public Person read() throws IOException {

            String line = fileScanner.nextLine();
            String[] arr = line.split(" ");
            String fn = arr[1];
            String mn = arr[2];
            String ln = arr[0];
            String strDate = arr[3] + " " + arr[4] + " " + arr[5];
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date bd = null;
            try{bd = sdf.parse(strDate);}catch(ParseException e){}

            return new Person(fn,mn,ln,bd);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
