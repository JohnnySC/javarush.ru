package com.javarush.test.level13.lesson11.home09;


/* Один метод в классе
1. Унаследовать Fox от интерфейса Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Методы удалять нельзя!
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Fox fox = new Fox();
        System.out.println(fox.getName());
    }

    public interface Animal
    {
       // Color getColor();
       public String getName();
       // Integer getAge();
    }

    public static class Fox implements Animal
    {
        public String getName()
        {
            return "Fox";
        }
    }
}
