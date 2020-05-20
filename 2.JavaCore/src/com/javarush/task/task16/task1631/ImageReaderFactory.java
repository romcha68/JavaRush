package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by User on 20.05.2020.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types){
        if(types != null){
            if(types.equals(ImageTypes.JPG)){
                return new JpgReader();
            }
            else if(types.equals(ImageTypes.BMP)){
                return new BmpReader();
            }
            else if(types.equals(ImageTypes.PNG)){
                return new PngReader();
            }
        }
        throw new IllegalArgumentException();
    }
}
