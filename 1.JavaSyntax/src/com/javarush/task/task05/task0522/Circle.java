package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(){
        this.x = 5;
        this.y = 5;
        this.radius = 5;
    }

    public Circle(int x, int y){
        this(x,y,20);
    }

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int radius){
        this(5,6,radius);
    }

    public static void main(String[] args) {

    }
}