package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String [] args){
        HashMap<String, Date> mm = createMap();
        removeAllSummerPeople(mm);
        System.out.println(mm);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Крутой", new Date("JUNE 5 1985"));
        map.put("Шварценеггер", new Date("JUNE 25 1975"));
        map.put("Ургант", new Date("JULY 6 1986"));
        map.put("Парашенко", new Date("JULY 10 1969"));
        map.put("Путин", new Date("SEPTEMBER 6 1975"));
        map.put("Давыдов", new Date("AUGUST 29 1985"));
        map.put("Вандам", new Date("APRIL 10 1970"));
        map.put("Медведев", new Date("MAY 2 1968"));
        map.put("Сталин", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {


        Iterator<Map.Entry<String,Date>> iterator=map.entrySet().iterator();
        while(iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }

        }
    }
}
