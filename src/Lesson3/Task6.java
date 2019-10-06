package Lesson3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        var x = new Random().nextInt(10);
        var k = 0;
        System.out.println(x);
        while (k <= 100) {
            if (k % x == 0){
                System.out.println(k);
            }
            k++;
        }

    }
}
