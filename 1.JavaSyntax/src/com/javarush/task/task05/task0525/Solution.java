package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(cat1);
        System.out.println(dog1);

    }
        public static class Cat {
            public String toString() { return "Cat"; }
        }

        public static class Dog {
            public String toString() { return "Dog"; }
        }


    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
}
