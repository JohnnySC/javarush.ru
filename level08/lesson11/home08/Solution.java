package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        int[] ar2 = new int[5];
        //Напишите тут ваш код
        int max=-999;
        int index = -1;
        for(int j=0; j<5; j++){
            for(int i=0;i<array.length;i++)
            {
                if (array[i] > max)
                {
                    max = array[i];
                    index = i;
                }
            }

            ar2[j]=max;
            array[index]=-66;
            max=-6888;

        }
        array[0]=ar2[0];
        array[1]=ar2[1];
        array[2]=ar2[2];
        array[3]=ar2[3];
        array[4]=ar2[4];



    }
}
