package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
       int[] ar1 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<ar1.length; i++)
            ar1[i]= Integer.parseInt(reader.readLine());
        //initialize(create and fill) an array here - инициализируйте (создайте и заполните) массив тут
        return ar1;
    }

    public static int max(int[] array) {
        int maxx=0;
       for(int i=0; i<array.length; i++)
           if(array[i]>maxx)
               maxx=array[i];
        //find the max value here - найдите максимальное значение в этом методе
        return maxx;
    }
}
