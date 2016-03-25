package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        String[] ar2 = new String[array.length];
        String curr = "";
        int index=-1;
        for (int j = 0; j < array.length; j++)
        {
           for(int i=0;i<array.length;i++)
                if(isGreaterThen(array[i],curr))
                {
                    curr = array[i];
                    index=i;
                }
            ar2[j]=curr;
            curr="";
            array[index]="";

        }

        for(int u=0;u<array.length;u++)
            array[u]=ar2[array.length-1-u];

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
