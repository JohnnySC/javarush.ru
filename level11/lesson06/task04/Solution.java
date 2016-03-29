package com.javarush.test.level11.lesson06.task04;

/* Все мы работники
Написать четыре класса: Worker(сотрудник), Manager(управляющий), Chief(директор) и  Secretary(секретарь).
Унаследовать управляющего, директора и секретаря от сотрудника.
*/

public class Solution
{
    public class Manager extends Worker
    {

    }

    public class Chief extends Worker
    {

    }

    public class Worker
    {
        String name;
        String secondName;
        boolean sex;
        int age;
        int salary;


    }

    public class Secretary extends Worker
    {

    }
}
