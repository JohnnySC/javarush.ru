package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if(nn1>nn2 && nn1>nn3)
        {
            if (nn2 > nn3)

                System.out.println(nn1 + " " + nn2 + " " + nn3);

            else
                System.out.println(nn1 + " " + nn3 + " " + nn2);
        }
        else if( nn2 > nn1 && nn2 > nn3){
            if(nn1>nn3)
                System.out.println(nn2 + " " + nn1 + " " + nn3);
                else
                System.out.println(nn2+ " " + nn3 + " " + nn1);}
        else {if (nn1> nn2)
            System.out.println(nn3+ " " + nn1 + " " + nn2);
        else System.out.println(nn3 + " " + nn2 + " " + nn1);}

    }

}
