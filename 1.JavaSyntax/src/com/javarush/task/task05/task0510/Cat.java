package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    private String color = "color";
    private String name;
    private String address;
    private int age;
    private int weight;

    public void initialize(String name){
        this.name = name;
        this.weight = 3;
        this.age = 5;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;

    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 5;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 5;

    }

    public static void main(String[] args) {

    }
}
