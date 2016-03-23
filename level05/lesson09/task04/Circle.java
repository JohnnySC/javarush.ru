package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius  width, color
*/

public class Circle
{
    public String circlename = null;

    public Circle(String centerX, String centerY, String radius)
    {
        this.circlename = centerX+centerY+radius;
    }

    public Circle(String centerX, String centerY, String radius, String width)
    {
        this.circlename = centerX+centerY+radius+width;
    }

    public Circle(String centerX, String centerY, String radius, String width,String color)
    {
        this.circlename = centerX+centerY+radius+width+color;
    }

}