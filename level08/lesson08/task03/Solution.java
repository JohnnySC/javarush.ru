package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args){
        HashMap<String, String> mp=createMap();
        System.out.println(getCountTheSameFirstName(mp,"Иван"));
        System.out.println(getCountTheSameLastName(mp,"Козлов"));
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Иванов","Иван");
        map.put("Баринцев","Олег");
        map.put("Козлов","Игнат");
        map.put("Березуцкий","Антон");
        map.put("Романенко","Глеб");
        map.put("Лобанов","Семен");
        map.put("Быков","Андрей");
        map.put("Купитман","Иван");
        map.put("Мальцев","Алексей");
        map.put("Корнеев","Петр");



        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count=0;
        Iterator<Map.Entry<String,String>>iterator=map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair =iterator.next();

            String value=pair.getValue();
            if(value.equals(name))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count=0;
        Iterator<Map.Entry<String,String>>iterator=map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, String> pair =iterator.next();
            String key=pair.getKey();
            if(key.equals(familiya))
                count++;
        }

        return count;

    }
}
