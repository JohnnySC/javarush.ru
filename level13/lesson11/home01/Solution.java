package com.javarush.test.level13.lesson11.home01;

/* Некорректные строки
Удали все некорректные строки в интерфейсе Button.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject
    {
        String NAME = "SimpleObject";
        void onPress();
    }

    interface Button extends SimpleObject
    {

        final String NAME = "Submit";
       // public void onPress();
       // protected void onPress();
       // void onPress();
    //    private void onPress();

     //   protected String onPress(Object o);
     //   String onPress(Object o);
      //  private String onPress(Object o);

    }
}
