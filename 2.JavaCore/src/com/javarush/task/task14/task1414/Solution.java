package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        boolean b = true;

        while(b){
            key = br.readLine();
            if(key.equals("cartoon")||key.equals("thriller")||key.equals("soapOpera")) {
                System.out.println(MovieFactory.getMovie(key).getClass().getSimpleName());
            }
            else {
                b = false;
                MovieFactory.getMovie(key);
            }
        }
    }
    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key))movie = new SoapOpera();
            else if ("thriller".equals(key))movie = new Thriller();
            else if ("cartoon".equals(key))movie = new Cartoon();

            return movie;
        }
    }
    static abstract class Movie {
    }
    private static class SoapOpera extends Movie {
    }
    private static class Thriller extends Movie {
    }
    private static class Cartoon extends Movie {
    }
}
