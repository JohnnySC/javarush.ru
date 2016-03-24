package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        int[] ar2=new int[20];
        int max=-1111;
       int index=-1;
        for(int j=0;j<20;j++)
        {
            for (int i = 0; i < array.length; i++)
                if (array[i] > max )
                {
                    max = array[i];
                    index=i;
                }
            array[index]=-2000;

            ar2[j]=max;

            max=-111;
        }
        for(int x=0;x<20;x++)
        array[x]=ar2[x];
    }
}
