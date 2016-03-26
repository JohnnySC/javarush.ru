package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Написать тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String vow = "";
        String cons="";
        for (int i = 0; i < s.length(); i++)
        {
            String ch =  s.substring(i, i+1);

            if (isVowel(ch))
                vow+=ch+" ";
            else
                cons+=ch+" ";

        }
        System.out.println(vow);
        System.out.println(cons);
    }

    public static String[] vowels = new String[]{"а", "я", "у", "ю", "и", "ы", "э", "е", "о", "ё"};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(String c)
    {
        c = c.toLowerCase();  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (String d : vowels)   //ищем среди массива гласных
        {
            if (c.equals(d))
                return true;
        }
        return false;
    }
}
