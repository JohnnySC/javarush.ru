package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        labels.put(0.1,"a");
        labels.put(0.23,"as");
        labels.put(0.546,"asdf");
        labels.put(3.32,"SDFA");
        labels.put(1.23,"asdfavwe");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
