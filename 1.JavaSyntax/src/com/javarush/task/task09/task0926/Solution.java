package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] mas = new int []{5,2,4,7,0};
        for(int i = 0; i < mas.length; i++){
            list.add(new int[mas[i]]);
            for(int j = 0; j < list.get(i).length; j++){
                list.get(i)[j] = list.get(i).length;
            }
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
