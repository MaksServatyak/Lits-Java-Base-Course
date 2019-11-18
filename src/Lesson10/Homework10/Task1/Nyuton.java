package Lesson10.Homework10.Task1;

import Lesson10.Homework10.Task1.Сonverter;

public class Nyuton implements Сonverter {
    @Override
    public void converter(int degrees) {

    }
    public void convertInNyuton(int degrees) {
        float nyuton = (float) (degrees*0.33);
        System.out.println(nyuton);
    }
}
