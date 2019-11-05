package Lesson9;

public class Main {
    public static void main(String[] args) {
        String one = "Hello world";
        String two = new String("Hello world");
        String three = "Hello world";
        if (one == two) {
            System.out.println("first statment is ok");
        }
        if (one.equals(two)) {
            System.out.println("second statment is ok");
        }
        if (one == three) {
            System.out.println("third statment is ok");
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= 10; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());


    }
}
