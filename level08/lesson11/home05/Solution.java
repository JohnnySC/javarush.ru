package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


      ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<s.length();i++)
            list.add(s.substring(i,i+1));

       String o=list.get(0).toUpperCase();
        list.set(0,o);
        for(int i=0;i<list.size();i++)
            if(list.get(i).equals(" "))
            {
                String t=list.get(i+1).toUpperCase();
                list.set((i + 1),t);
            }
        for(String x:list)
        System.out.print(x);


    }


}
