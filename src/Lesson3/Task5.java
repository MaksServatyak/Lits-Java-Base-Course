package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        var i = 100;
        var n=1;
        var sum = 0;
        while (i <= 200) {
            if (n>98){
                sum = sum + i;
            }
            n++;
            i++;
        }
        System.out.println(sum);

    }
}
