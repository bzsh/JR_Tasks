package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nArg = Integer.parseInt(reader.readLine());

        /* Выбрал цикл while, потому что я не знаю какой длины у меня будет число,
           главное что не 0 */
        while (nArg != 0) {
            if (nArg % 2 == 0) {
                System.out.println(nArg + "even");
                even++;
            }
            else {
                System.out.println(nArg + "odd");
                odd++;
            }
            nArg /= 10; /* Деление на 10 помогает откинуть у числа одно значение,
            но только у int, потому что это значение, которое откидывалось,
            идет за знак запятой, а он отбрасывается в int. */
        }
        System.out.println("Even: " + even + " Odd: " + odd );
    }
}