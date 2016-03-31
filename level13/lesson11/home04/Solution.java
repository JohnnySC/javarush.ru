package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;


public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        FileWriter writer = new FileWriter(name);
        ArrayList<String> list = new ArrayList<String>();

        while(true) {
            String s = br.readLine();
            list.add(s);
            if (s.equals("exit")) {
                for (String x: list) {
                    writer.write(x);
                }
                break;
            }
            list.add("\n");
        }
        writer.close();
    }
}
