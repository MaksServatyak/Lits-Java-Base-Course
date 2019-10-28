package Lesson9.Homework9;

public class Task4 {
    public String text;

    public void isPalindrom(String text) {
        this.text = text;
        StringBuffer rev = new StringBuffer(text).reverse();
        String strReverse = rev.toString();
        if (text.equalsIgnoreCase(strReverse)){
            System.out.println("it is");

        }else {
            System.out.println("it isn't");
        }


    }
}
