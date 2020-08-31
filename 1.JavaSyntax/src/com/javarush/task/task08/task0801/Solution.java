package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> hs = new HashSet<>();
        hs.add("арбуз");
        hs.add("банан");
        hs.add("вишня");
        hs.add("груша");
        hs.add("дыня");
        hs.add("ежевика");
        hs.add("женьшень");
        hs.add("земляника");
        hs.add("ирис");
        hs.add("картофель");
        for(String o: hs) System.out.println(o);


    }
}
