package com.javarush.test.level15.lesson12.home04;

/**
 * Created by johnny on 09.02.16.
 */
public class Earth implements Planet
{
    private static final Earth instance = new Earth();
    private Earth(){}
    public static Earth getInstance(){
        return instance;
    }
}
