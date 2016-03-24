package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human ded1=new Human();
        ded1.name="ded1";
        ded1.sex=true;
        ded1.age=88;
        Human ded2 = new Human();
        ded2.name = "ded2";
        ded2.sex=true;
        ded2.age=86;
        Human bab1=new Human();
        bab1.name="bab1";
        bab1.sex=false;
        bab1.age=80;
        Human bab2 = new Human();
        bab2.name = "bab2";
        bab2.sex=false;
        bab2.age=76;
        Human otec = new Human();
        otec.name = "Pasha";
        otec.sex =  true;
        otec.age = 45;
        otec.father = ded1;
        otec.mother = bab1;
        Human mat=new Human();
        mat.name = "katya";
        mat.sex=false;
        mat.age=39;
        mat.father = ded2;
        mat.mother = bab2;
        Human kid1 = new Human();
        kid1.name= "oleg";
        kid1.sex = true;
        kid1.age = 20;
        kid1.father=otec;
        kid1.mother=mat;
        Human kid2 = new Human();
        kid2.name= "olya";
        kid2.sex = false;
        kid2.age = 18;
        kid2.father=otec;
        kid2.mother=mat;
        Human kid3 = new Human();
        kid3.name= "ololosh";
        kid3.sex = true;
        kid3.age = 15;
        kid3.father=otec;
        kid3.mother=mat;

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(otec);
        System.out.println(mat);
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
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
