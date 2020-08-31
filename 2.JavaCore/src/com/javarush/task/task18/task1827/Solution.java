package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

/*

19847984Куртка для сноубордистов, разм10173.991234

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length != 0 && args[0].equals("-c")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String file = br.readLine();
            String productName = args[1];
            String price = args[2];
            String quantity = args[3];
            String toWrite ;
            br.close();
            int maxId = 0;
            BufferedReader bri = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            BufferedWriter bwo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

            while (bri.ready()) {
                int id = Integer.parseInt(bri.readLine().substring(0,8).trim());
                if(maxId < id ) maxId = id;
            }

            bri.close();
            toWrite = String.format("%n%-8d%-30s%-8s%-4s", ++maxId,productName,price,quantity);
            bwo.write(toWrite);
            bwo.close();
        }
    }
}