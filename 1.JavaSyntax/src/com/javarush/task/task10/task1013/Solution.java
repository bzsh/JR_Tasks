package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int phone;
        private int index;
        private String address;

        public Human(){}
        public Human(String name){this.name = name;}
        public Human(String name, int age){this.name = name; this.age = age;}
        public Human(String name, int age, boolean sex){this.name = name; this.age = age; this.sex = sex;}
        public Human(String name, int age, boolean sex, int phone){this.name = name; this.age = age; this.sex = sex; this.phone = phone;}
        public Human(String name, int age, boolean sex, int phone, String address){this.name = name; this.age = age; this.sex = sex; this.phone = phone; this.address = address;}
        public Human(String name, int age, boolean sex, int phone, String address, int index){this.name = name; this.age = age; this.sex = sex; this.phone = phone; this.address = address; this.index = index;}
        public Human(String name, int age, boolean sex, String address, int index){this.name = name; this.age = age; this.sex = sex; this.phone = 123; this.address = address; this.index = index;}
        public Human(String name, int age, boolean sex, String address){this.name = name; this.age = age; this.sex = sex; this.phone = 123; this.address = address; this.index = 111111;}
        public Human(String name, boolean sex, int phone, String address, int index){this.name = name; this.age = 20; this.sex = sex; this.phone = phone; this.address = address; this.index = index;}

    }
}
