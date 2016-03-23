package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Boolean stop = false;
        int sum =  0;
        Scanner scanner =  new Scanner(System.in);
        while (!stop) {
            String preValue = scanner.nextLine();
            try{
                if (!preValue.equals("сумма")){
                    int value = Integer.parseInt(preValue);
                    sum += value;
                }
                else{
                    stop = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Что  то пошло не так..");
            }
        }
        System.out.print(sum);

    }
}
