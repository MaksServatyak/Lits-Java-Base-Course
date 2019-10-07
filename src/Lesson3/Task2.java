package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        int b = 0;
        String k = "";

        for (i = 1; i <= 100; i++) {
            int d = 0;
            for (b = i; b >= 1; b--) {
                if (i % b == 0) {
                    d = d + 1;
                }
            }
            if (d == 2) {
                k = k + i + " ";
            }
        }
        System.out.println(k);

    }

}
