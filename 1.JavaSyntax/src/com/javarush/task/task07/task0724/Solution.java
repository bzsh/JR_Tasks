package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gF1 = new Human("Сергей", true, 55);
        Human gM2 = new Human("Марина", false, 55);
        Human gF = new Human("Павел", true, 55);
        Human gM = new Human("Елена", false, 55);
        Human fa = new Human("Слава", true, 30, gF, gM);
        Human ma = new Human("Зина", false, 30, gF1, gM2);
        Human ch1 = new Human("Дима", true, 3, fa, ma);
        Human ch2 = new Human("Саша", false, 5, fa, ma);
        Human ch3 = new Human("Костя", true, 5, fa, ma);

        System.out.println(gF1);
        System.out.println(gM2);
        System.out.println(gM);
        System.out.println(gF);
        System.out.println(fa);
        System.out.println(ma);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















