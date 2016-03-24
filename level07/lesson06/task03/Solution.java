package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String>list = new ArrayList<String>();
        String[] ll=new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++)
            list.add(reader.readLine());
        for(int i=0;i<list.size();i++)
        {
           ll[i] = list.get(4-i);

        }
        for(int i=0;i<5;i++)
        {
            list.set(i, ll[i]);
            System.out.println(list.get(i));
        }

    }
}
