package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum=-100000;
        int  minimum=100000;

        //Напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<20;i++)
            list.add(0,Integer.parseInt(reader.readLine()));

       for(int i=0;i<20;i++)
           if(list.get(i)>maximum)
               maximum=list.get(i);

        for(int i=0;i<20;i++)
            if(list.get(i)<minimum)
                minimum=list.get(i);


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
