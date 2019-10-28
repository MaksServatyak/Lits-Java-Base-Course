package Lesson9.Homework9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularForNumber {
    public static void main(String[] args) {
        String line="+38(066)666-66-66";
        String pattern="^\\+([0-9\\-]?){9,11}[0-9]$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        System.out.println(m.matches());


    }
}
