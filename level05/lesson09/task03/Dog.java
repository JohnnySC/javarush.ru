package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String dogname = null;

    public Dog(String name)
    {
        this.dogname = name;
    }

    public Dog(String name, int height)
    {
        this.dogname = name + height;
    }

    public Dog(String name, int height, String colour)
    {
        this.dogname = name + height + colour;
    }

}
