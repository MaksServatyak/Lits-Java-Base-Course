package Lesson11;

public class IsPalindrom {
    String text;

    public void isPalindrom(String text) {
        this.text = text;
        int k=0;

        for (int i = 0; text.length() > i; i++) {
            if (text.length() - 1 - i > i) {
                k++;

                if (text.charAt(text.length() - 1 - i) != text.charAt(i)) {
                    System.out.println("it is not palindom");
                    break;
                }
            }


        }
        if (k<=text.length()-k){
            System.out.println("it is palindrom");
        }


    }
}
