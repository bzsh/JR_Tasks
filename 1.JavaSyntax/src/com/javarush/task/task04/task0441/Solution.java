package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a == b && b != c) System.out.println(a);
        if(c == b && b != a) System.out.println(b);
        if(a == c && b != c) System.out.println(c);
        if(a == c && c == b) System.out.println(c);

        if(a < b && b < c) System.out.println(b);
        if(a > b && b > c) System.out.println(b);

        if(b < a && a < c) System.out.println(a);
        if(b > a && a > c) System.out.println(a);

        if(a < c && c < b) System.out.println(c);
        if(a > c && c > b) System.out.println(c);
    }
}
