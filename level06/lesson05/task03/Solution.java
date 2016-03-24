package com.javarush.test.level06.lesson05.task03;

/* 10 000 объектов Cat и Dog
Создать в цикле 10 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat[] c = new Cat[10000];
        Dog[] d = new Dog[10000];

        for (int i = 0; i < 10000; i++)
        {
            c[i] = new Cat();
            d[i] = new Dog();
        }
        int test = 111;
        System.out.println(test);
    }
}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}