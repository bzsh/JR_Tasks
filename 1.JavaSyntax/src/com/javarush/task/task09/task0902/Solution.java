package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(method1());
    }

    public static String method1() {
        System.out.println(method2());
        StackTraceElement[] element = Thread.currentThread().getStackTrace() ;
        String y = null;
        y = element[2].getMethodName();
        return y;

    }

    public static String method2() {

        System.out.println(method3());
        StackTraceElement[] element = Thread.currentThread().getStackTrace() ;
        String y = null;
        y = element[2].getMethodName();
        return y;
    }

    public static String method3() {
        System.out.println(method4());
        StackTraceElement[] element = Thread.currentThread().getStackTrace() ;
        String y = null;
        y = element[2].getMethodName();
        return y;


    }

    public static String method4() {
        System.out.println(method5());
        StackTraceElement[] element = Thread.currentThread().getStackTrace() ;
        String y = null;
        y = element[2].getMethodName();
        return y;

    }

    public static String method5() {

        StackTraceElement[] element = Thread.currentThread().getStackTrace() ;
        String y = null;
        y = element[2].getMethodName();
        return y;
    }
}
