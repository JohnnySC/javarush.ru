package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sn1 = reader.readLine();
        int nn1 = Integer.parseInt(sn1);
        String sn2 = reader.readLine();
        int nn2 = Integer.parseInt(sn2);
        String sn3 = reader.readLine();
        int nn3 = Integer.parseInt(sn3);
        String sn4 = reader.readLine();
        int nn4 = Integer.parseInt(sn4);

        int max1, max2;
        if(nn1>nn2)
           max1 = nn1;
        else
            max1 = nn2;
        if(nn3>nn4)
             max2 = nn3;
        else
            max2 = nn4;
        if(max1<max2)
            System.out.println(max2);
        else
            System.out.println(max1);

    }
}
