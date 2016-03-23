package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -100;

        int a = Integer.parseInt(reader.readLine());
        if(a>0)
        {
            for (int i = 0; i < a; i++)
            {
                int j = Integer.parseInt(reader.readLine());
                if (j > maximum)
                    maximum = j;

            }
        }
               System.out.println(maximum);
    }
}
