package Lesson10.Homework10.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String line="<input class=“regex” type=“text” name=”name” value=“Iron Man”>";
        String pattern="\\W";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        System.out.println(m.matches());
    }
}
