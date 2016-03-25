package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args){
        HashSet<Integer> ss=new HashSet<Integer>();
        ss=createSet();
        System.out.println(removeAllNumbersMoreThen10(ss));
    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int j=0;j<20;j++)
            set.add(j+1);

        //Напишите тут ваш код
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if (a > 10)
                iterator.remove();
        }
        return set;

    }
}
