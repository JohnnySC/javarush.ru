package com.javarush.test.level08.lesson11.bonus01;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();
        if (month == "January")
            System.out.println(month + " is 1 month");
        else if (month.equals("February"))
            System.out.println(month + " is 2 month");
        else if (month.equals( "March"))
            System.out.println(month + " is 3 month");
        else if (month.equals("April"))
            System.out.println(month + " is 4 month");
        else if (month.equals("May"))
            System.out.println(month + " is 5 month");
        else if (month.equals("June"))
            System.out.println(month + " is 6 month");
        else if (month.equals("July"))
            System.out.println(month + " is 7 month");
        else if (month.equals("August"))
            System.out.println(month + " is 8 month");
        else if (month.equals("September"))
            System.out.println(month + " is 9 month");
        else if (month.equals("October"))
            System.out.println(month + " is 10 month");
        else if (month.equals("November"))
            System.out.println(month + " is 11 month");
        else if (month.equals("December"))
            System.out.println(month + " is 12 month");
        else
            System.out.println("Wrong name of the month!");

    }
}



