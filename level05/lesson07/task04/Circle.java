package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    public String circlename = null;

    public void initialize(String centerX, String centerY, String radius)
    {
        this.circlename = centerX+centerY+radius;
    }

    public void initialize(String centerX, String centerY, String radius, String width)
    {
        this.circlename = centerX+centerY+radius+width;
    }

    public void initialize(String centerX, String centerY, String radius, String width,String color)
    {
        this.circlename = centerX+centerY+radius+width+color;
    }

}
