package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
       HashSet<String>set = new HashSet<String>();
        set.add("Лера");
        set.add("Луиза");
        set.add("Лодка");
        set.add("Люда");
        set.add("Люба");
        set.add("Лошадь");
        set.add("Лопата");
        set.add("Левый");
        set.add("Ломтик");
        set.add("Лом");
        set.add("Лиза");
        set.add("Лучший");
        set.add("Лень");
        set.add("Лицей");
        set.add("Лоток");
        set.add("Лузер");
        set.add("Лорд");
        set.add("Лиса");
        set.add("Люся");
        set.add("Ладно");
        return set;

    }
}
