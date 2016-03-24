package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] nnn = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i < nnn.length; i++)
            nnn[i] = Integer.parseInt(reader.readLine());

        int[] nn1 = new int[10];
        int[] nn2 = new int[10];
        for(int i=0; i<nn1.length; i++)
            nn1[i] = nnn[i];
        for(int i=0; i<nn2.length;i++)
            nn2[i]=nnn[10+i];
        for(int i=0; i<10; i++)
            System.out.println(nn2[i]);

    }
}
