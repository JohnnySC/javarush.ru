package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String dogname = null;

    public void initialize(String name)
    {
        this.dogname = name;
    }

    public void initialize(String name, int height)
    {
        this.dogname = name + height;
    }

    public void initialize(String name, int height, String colour)
    {
        this.dogname = name + height + colour;
    }
}
