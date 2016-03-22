package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
        String name = bufferedReader.readLine();

        System.out.println(name +" захватит мир через "+ nAge + " лет. Му-ха-ха!");
    }
}