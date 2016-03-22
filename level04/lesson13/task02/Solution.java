package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sm = reader.readLine();
        int m = Integer.parseInt(sm);
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);

        String s1="8";
        for(int i=1; i<n; i++)
        {
            s1 = s1 + "8";
        }
        for(int i=0; i<m;i++)
            System.out.println(s1);

    }
}
