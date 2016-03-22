package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String sn1 = reader.readLine();
        int n1 = Integer.parseInt(sn1);
        String sn2 = reader.readLine();
        int n2 = Integer.parseInt(sn2);
        String sn3 = reader.readLine();
        int n3 = Integer.parseInt(sn3);

        if(n1>n2 && n2>n3 || n1<n2 && n2<n3)
            System.out.println(n2);
        else if(n2>n3 && n3>n1 || n2<n3 && n3<n1 )
            System.out.println(n3);
        else
            System.out.println(n1);

    }
}
