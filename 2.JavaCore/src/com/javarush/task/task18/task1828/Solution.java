package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) throws IOException{

        if(args.length != 0) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = br.readLine();
            br.close();

            String param = args[0];
            String id = args[1];
            String productName = null;
            String price = null;
            String quantity = null;
            String update ;

            if(param.equals("-u")){
                productName = args[2];
                price = args[3];
                quantity = args[4];
            }


            HashMap<String,String> map = new HashMap<>();
            ArrayList<String> list = new ArrayList<>();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            BufferedWriter bfw;

            while(bfr.ready()){
                String str = bfr.readLine();
                map.put(str.substring(0,8).trim(), str);
                list.add(str.substring(0,8).trim());
            }
            bfr.close();

            bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, false)));

            switch(param){

                case "-u": {
                    if (map.containsKey(id)) {
                        update = String.format("%-8s%-30s%-8s%-4s", id, productName, price, quantity);
                        map.put(id, update);

                        for (String s : list) {
                            bfw.write(map.get(s));
                            bfw.newLine();
                        }
                    }
                    break;
                }
                case "-d": {
                    if(map.containsKey(id)){
                        map.remove(id);

                        for(String s : list){
                            if(map.containsKey(s)){
                            bfw.write(map.get(s));
                            bfw.newLine();
                            }
                        }
                    }
                    break;
                }
            }bfw.close();
        }
    }
}
