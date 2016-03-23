package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 12 2012".
*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Solution
{
    public static void main(String[] args)
    {

        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        String today = formatter.format(date);
        System.out.println(today);
    }
}
