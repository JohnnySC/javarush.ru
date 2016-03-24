package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for(int i=0;i<10;i++)
        {
            String s=reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);


        for(int i=0;i<result.size();i++)
            System.out.println(result.get(i));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {


        ArrayList<String> temp = new ArrayList<String>();
        for(int i=0;i<2*list.size();i++)
          temp.add("word");

        for(int i=0;i<list.size();i++)
        {
            temp.set(2*i,list.get(i));
            temp.set(2*i+1,list.get(i));


        }
        return temp;
    }
}
