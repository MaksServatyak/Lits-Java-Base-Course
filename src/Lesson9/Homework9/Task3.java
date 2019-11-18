package Lesson9.Homework9;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String one ="<input class=“regex” type=“text” name=”Name” value=“Iron Man”>".replaceAll("\\W", " ");
        String two = one.replaceAll("input class", " ");
        String three=two.replaceAll("type", " ");
        String four=three.replaceAll("name", " ");
        String five=four.replaceAll("value"," ");
        List var10000 = Arrays.asList(one);
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
        System.out.println(five);


    }
}
