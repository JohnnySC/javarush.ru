package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public int findmin(int[] arr){
        int res1=1110;
        for(int i=0; i<arr.length;i++)
            if(arr[i]<res1)
                res1=arr[i];
        return res1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        for(int i=0;i<array.length; i++)
            array[i]=Integer.parseInt(reader.readLine());


        int res1=1110;
        for(int i=0; i<array.length;i++)
            if(array[i]<res1)
                res1=array[i];
        System.out.println(res1);
        int res2 = 11111;
        for(int i=0; i<array.length;i++)
            if(array[i]<res2 && array[i]!=res1)
                res2=array[i];
        System.out.println(res2);
        int res3 = 3333;
        for(int i=0; i<array.length;i++)
            if(array[i]<res3 && array[i]!=res2 && array[i]!=res1)
                res3=array[i];
        System.out.println(res3);
        int res4 = 9999;
        for(int i=0;i<array.length;i++)
            if(array[i]<res4 && array[i]!=res3 && array[i]!=res2 && array[i]!=res1)
                res4=array[i];
        System.out.println(res4);

        for(int i=0;i<array.length;i++)
            if(array[i]>res4)
                System.out.println(array[i]);



    }
}
