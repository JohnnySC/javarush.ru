package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Johnny on 20.07.2014.
 */
public class Singleton
{
    private static Singleton singleton=new Singleton();

    public static Singleton getInstance()
    {
        return singleton;
    }

    private Singleton()
    {

    }
}
