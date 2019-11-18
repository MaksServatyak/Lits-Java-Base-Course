package Lesson10.Homework10.Task1;

import Lesson10.Homework10.Task1.Сonverter;

public class Faringate implements Сonverter {
    @Override
    public void converter(int degrees) {

    }
    public void convertInKelvin(int degrees) {
        float faringate = (float) (degrees*1.8+32);
        System.out.println(faringate);
    }
}
