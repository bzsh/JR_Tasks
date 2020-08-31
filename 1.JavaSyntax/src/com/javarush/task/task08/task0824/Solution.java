package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        ArrayList<Human> grParents = new ArrayList<>();

        children.add(new Human("Lesha", true, 5));
        children.add(new Human("Masha", false, 5));
        children.add(new Human("Sergey", true, 5));
        parents1.add(new Human("Gena", true, 30, children));
        parents2.add(new Human("Lena", false, 30,children));
        grParents.add(new Human("Petya", true, 50, parents1));
        grParents.add(new Human("Grisha", true, 50, parents2));
        grParents.add(new Human("Valia", false, 50, parents1));
        grParents.add(new Human("Galia", false, 50, parents2));

        for(Human x : grParents) System.out.println(x);
        for(Human x : parents1) System.out.println(x);
        for(Human x : parents2) System.out.println(x);
        for(Human x : children) System.out.println(x);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
