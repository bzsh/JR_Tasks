package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    private String name;
    private int age;
    private char sex;


    public char getSex(){
        return  sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
