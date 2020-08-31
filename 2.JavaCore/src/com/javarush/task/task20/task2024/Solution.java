package com.javarush.task.task20.task2024;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public Solution(){}

    public void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
    }

    public void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
        ois.defaultReadObject();
    }

    public static void main(String[] args) {

    }
}
