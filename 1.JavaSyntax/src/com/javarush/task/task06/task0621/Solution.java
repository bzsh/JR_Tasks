package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFatherName = reader.readLine();
        Cat catGrFather= new Cat(grFatherName);

        String grMotherName = reader.readLine();
        Cat catGrMother = new Cat(grMotherName);

        String fatherName = reader.readLine();
        Cat catFather= new Cat(fatherName, null, catGrFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrFather.toString());
        System.out.println(catGrMother.toString());
        System.out.println(catFather.toString());
        System.out.println(catMother.toString());
        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());
    }

    public static class Cat {
        private String name;
        private Cat mom;
        private Cat dad;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }
        @Override
        public String toString() {
            if (mom == null && dad == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (dad == null && mom != null)
                return "The cat's name is " + name + ", mother is " + mom.name + ", no father";
            else if (mom == null && dad != null)
                return "The cat's name is " + name + ", no mother, father is " + dad.name;
            else
                return "The cat's name is " + name + ", mother is " + mom.name + ", father is " +  dad.name;
        }
    }
}

