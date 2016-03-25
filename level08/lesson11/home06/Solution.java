package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws NullPointerException
    {
        Human kid1 = new Human("Andrew",true,15);

        Human kid2 = new Human("Maria",false,13);

        Human kid3 = new Human("Joe",true,12);


    ArrayList<Human> kids = new ArrayList<Human>();
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);

        Human father = new Human("Daddy",true,40);

        father.children=kids;


        Human mother = new Human("Mom",false,35);

        mother.children=kids;


        Human ded1 = new Human("Grandpa",true,80);


        Human ded2 = new Human("grandDaddy",true,75);


        Human bab1 = new Human("baby1",false,80);


        Human bab2 = new Human("baby2",false,75);


        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);


        System.out.println(father);
        System.out.println(mother);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);



    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name,boolean sex,int age){
        this.name=name;
            this.age = age;
            this.sex=sex;
            this.children=new ArrayList<Human>();//here was the f*ing problem
    }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
