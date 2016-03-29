package com.javarush.test.level11.lesson06.task02;

/* Домашние животные
Написать три класса: Pet (домашнее животное), Cat(кот) и Dog(собака).
Унаследовать кота и собаку от животного.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public class Pet
    {
        String name;
        int age;
        int weight;
        void move(){
            System.out.println("it is moving");
        }

    }

    public class Cat extends Pet
    {

    }

    public class Dog extends Pet
    {

    }
}
