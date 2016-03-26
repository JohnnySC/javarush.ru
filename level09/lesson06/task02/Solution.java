package com.javarush.test.level09.lesson06.task02;

/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        { //Напишите тут ваш код

            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e)
        {
            //Напишите тут ваш код
            System.out.println("NullPointerException has been caught.");

        }
    }
}
