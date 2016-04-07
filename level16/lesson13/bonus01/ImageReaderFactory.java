package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by johnny on 29.03.16.
 */
 public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes type){
        ImageReader imageReader;
       if(type == ImageTypes.BMP)
           imageReader = new BmpReader();
        else if(type == ImageTypes.JPG)
           imageReader = new JpgReader();
        else if(type == ImageTypes.PNG)
           imageReader = new PngReader();
        else
                throw new IllegalArgumentException("Неизвестный тип картинки");

        return imageReader;
    }
}
