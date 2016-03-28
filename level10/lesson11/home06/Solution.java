package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
       String name;
        String secondName;
        boolean sex;
        int age;
        int salary;
        boolean work;

        public Human(String name){                                 //1
            this.name=name;
        }
        public Human(String name, String secondName){                   //2
            this.name = name;
            this.secondName = secondName;

        }
        public Human(String name,String secondName, boolean sex){           //3
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
        }
        public Human(String name,String secondName, int age){                 //4
            this.name = name;
            this.secondName = secondName;
            this.age = age;
        }
        public Human(String name,String secondName, boolean sex, int age){           //5
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean work){                           //6
            this.name=name;
            this.work=work;
        }
        public Human(String name, boolean work, int salary){                     //7
            this.name= name;
            this.work = work;
            this.salary = salary;
        }

        public Human(String name, String secondName,int age,boolean work){              //8
            this.name = name;
            this.secondName = secondName;
            this.age =age;
            this.work=work;
        }

        public Human(String name, int age){             //9
            this.name = name;
            this.age = age;
        }



        public Human(String name, String secondName, boolean sex,int age,boolean work, int salary){  //10
            this.name =name;
            this.secondName=secondName;
            this.sex = sex;
            this.age = age;
            this.work=work;
            this.salary = salary;
        }
    }
}
