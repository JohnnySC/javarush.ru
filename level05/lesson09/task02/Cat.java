package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String catname = null;
    public Cat(String name){
        this.catname = name;
    }
    public Cat(String name, int weight, int age){
        this.catname = name +weight+ age;
    }
    public Cat(String name, int age){
        this.catname = name+ age;
    }
    public Cat(int weight, String colour){
        this.catname = weight + colour;
    }
    public Cat(int weight, String colour, String address){
        this.catname = weight + colour+address;
    }


}
