package Lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.parse("12/13/2012 23-55-54", DateTimeFormatter.ofPattern("MM/d/yyyy HH-mm-s")));
        System.out.println(LocalDate.parse("12/13/2012", DateTimeFormatter.ofPattern("MM/d/yyyy")));
        System.out.println(LocalTime.parse("23-55-54", DateTimeFormatter.ofPattern("HH-mm-s")));


    }
}
