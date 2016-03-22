package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sn1 = reader.readLine();
        int y = Integer.parseInt(sn1);
        String sn2 =reader.readLine();
        int m = Integer.parseInt(sn2);
        String sn3 = reader.readLine();
        int d = Integer.parseInt(sn3);

        System.out.println("Меня зовут "+ name);
        System.out.println("Я родился " + d +"." + m + "."+ y);


    }
}
