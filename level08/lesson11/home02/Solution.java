package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //Написать тут ваш код
        result.add(new Cat("murzik"));
        result.add(new Cat("boris"));
        result.add(new Cat("pushinka"));
        result.add(new Cat("begemot"));

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> res = new HashSet<Dog>();
        res.add(new Dog("tyafka"));
        res.add(new Dog("lapka"));
        res.add(new Dog("jmurik"));
        //Написать тут ваш код
        return res;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> jj=new HashSet<Object>();
        jj.addAll(cats);
        jj.addAll(dogs);
        //Написать тут ваш код
        return jj;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //Написать тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //Написать тут ваш код
        for(Object o:pets)
        {
            System.out.println(o);
        }
    }

    //Написать тут ваш код
    public static class Cat{
        String name;
        public Cat(String name){
            this.name=name;
        }

    }
    public static class Dog{
        String name;
        public Dog(String name){
            this.name = name;
        }
    }
}
