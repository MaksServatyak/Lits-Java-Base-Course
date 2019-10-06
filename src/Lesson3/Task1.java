package Lesson3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        var c = "-";
        var n="*";
        var q="+";
        var a = 0;
        var b = 0;
        if (c == "-") {
            a = 3;
            b = 3;
        } else if (n == "*") {
            a = 5;
            b = 8;

        } else if (q=="+"){
            a = 1;
            b = 9;

        }else {
            System.out.println("Eror");
        }
        System.out.println(a + 11 / 12 * (b + b) / 12);


    }
}
