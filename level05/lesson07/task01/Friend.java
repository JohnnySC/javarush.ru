package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    public String friendname = null;
    public void initialize(String name){
        this.friendname = name;
    }
    public void initialize(String name, int age){
        this.friendname = name + age;
    }
    public void initialize(String name, int age, int sex){
        this.friendname = name+ age+sex;
    }

}
