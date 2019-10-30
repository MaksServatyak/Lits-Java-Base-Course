package Lesson10.Homework10.Task1;

import Lesson10.Homework10.Task1.Сonverter;

public class Kelvin implements Сonverter {


    @Override
    public void converter(int degrees) {

    }
    public void convertInKelvin(int degrees) {
        float kelvin = (float) (degrees + 273.15);
        System.out.println(kelvin);
    }
}
