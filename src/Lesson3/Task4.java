package Lesson3;

public class Task4 {
    public static void main(String[] args) {
        var i = 0;
        var n=1;
        var sum = 0;
        while (i <= 99) {
           if (n<=3){
                n++;
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);

    }
}
