package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
public String friendname = null;
    public Friend(String name){
        this.friendname = name;
    }
    public Friend(String name, int age){
        this.friendname = name + age;
    }
    public Friend(String name, int age, int sex){
        this.friendname = name+ age+sex;
    }

}