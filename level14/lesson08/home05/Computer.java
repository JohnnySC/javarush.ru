package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Johnny on 19.07.2014.
 */
public class Computer
{
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer()
    {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard()
    {
        return new Keyboard();
    }

    public Mouse getMouse()
    {
        return new Mouse();
    }

    public Monitor getMonitor()
    {
        return new Monitor();
    }
}
