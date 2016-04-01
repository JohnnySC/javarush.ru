package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = 0;

        if (a <= 0 || b <= 0)
            System.out.println("Enter positive numbers");
        else
        {

            if (a == b)
                c = a;
            else if (a < b)
            {
                if (b % a == 0)
                    c = a;
                else
                {
                    int i = a;
                    while (i > 0)
                    {
                        if (a % i == 0 && b % i == 0)
                        {
                            c = i;
                            break;
                        } else
                            i--;
                    }
                }
            } else if (b < a)
            {
                if (a % b == 0)
                    c = b;
                else
                {
                    int i = b;
                    while (i > 0)
                    {
                        if (a % i == 0 && b % i == 0)
                        {
                            c = i;
                            break;
                        } else
                            i--;
                    }
                }
            } else
                System.out.println("Enter positive numbers");

            System.out.println(c);
        }
    }
}
