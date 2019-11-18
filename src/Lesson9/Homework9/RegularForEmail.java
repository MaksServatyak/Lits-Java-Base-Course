package Lesson9.Homework9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularForEmail {
    public static void main(String[] args) {
        String line="maksservatya@gmail.com";
        String pattern="([w.-]+)+(@)([w-]+)(.[a-zA-z]+)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.matches()){
            System.out.println("Good");
        }else {
            System.out.println("NO MATCH");
        }


    }
}
