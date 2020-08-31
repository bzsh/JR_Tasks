package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1}
        };
        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 5");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        boolean bool = false; // если bool   -    true, то предыдущее число в массиве была единица, если false, то это начало анализа массива, либо был ноль/конец одномерного массива в многомерном
        byte[] example = new byte[a[0].length]; // создали проверочный массив размером "a[0].length"
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] == 1 && !bool){count++; bool = true; }  // инкреминируем count, если видим единицу впервые или после ноля/конца(bool) рассматриваемого одномерного массива
                if(a[i][j] == 0 || j == a[i].length-1) bool = false;  // если ноль или конец массива, то bool = false
            }
            if(i != 0) {
                for(int k = 0; k < a[i].length; k++){ //проверяем что верхний цикл лишнего насчитал, если насчитал, то корректируем count --;
                    if(a[i][k] == 1 && a[i][k] == example[k]){
                        if(!bool){count--; bool = true;}
                    }
                    if(a[i][k]  == 0 || k == a[i].length-1) bool = false;
                }
            }
            for(int k = 0; k < a[i].length; k++)example[k] = a[i][k]; // заливаем в проверочный массив проанализированный выше массив для будущей проверки
        }
        return count;
    }
}
