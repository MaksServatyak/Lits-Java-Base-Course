package Lesson18;


import java.awt.List;
import java.time.LocalDate;
import java.util.*;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        MapUtil.swapPlacesKeysAndValues();

       var tags= new LinkedList<String>();
       tags.add(0,"sfhdsfhu");
        tags.add(1,"ud");
        tags.add(2,"kfl");
        tags.add(3,"eg");
        tags.add(4,"ldsg");
        tags.add(5,"jsgr");
        tags.add(6,"rtu");






        var task = new LinkedList<Task>() ;


        task.add(0,new Task("qw", LocalDate.of(2021, 5, 5), Type.DONE,tags.get(0)));
        task.add(1,new Task("qw", LocalDate.of(2021, 5, 5), Type.NEW, tags.get(0)));
        task.add(2,new Task("Book", LocalDate.of(2004, 5, 23), Type.READING,tags.get(0)));
        task.add(3,new Task("bbd", LocalDate.of(2001, 5, 23), Type.NEW,tags.get(1)));
        task.add(4,new Task("dd", LocalDate.of(2032, 1, 23), Type.DONE, tags.get(1)));
        task.add(5,new Task("cc", LocalDate.of(2011, 5, 23), Type.NEW, tags.get(1)));
        task.add(6,new Task("Book", LocalDate.of(2012, 5, 23), Type.READING, tags.get(1)));
        task.add(7,new Task("we", LocalDate.of(2022, 5, 23), Type.READING, tags.get(2)));
        task.add(8,new Task("g", LocalDate.of(2023, 7, 23), Type.DONE, tags.get(3)));
        task.add(9,new Task("Book", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(4)));
        task.add(10,new Task("j", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(3)));
        task.add(11,new Task("Book", LocalDate.of(2041, 5, 23), Type.READING, tags.get(2)));
        task.add(12,new Task("Book", LocalDate.of(2041, 2, 23), Type.READING, tags.get(2)));
        task.add(13,new Task("wke", LocalDate.of(2041, 5, 23), Type.READING, tags.get(3)));
        task.add(14,new Task("Book", LocalDate.of(2041, 5, 23), Type.READING, tags.get(3)));
        task.add(15,new Task("we", LocalDate.of(2041, 5, 22), Type.READING, tags.get(2)));
        task.add(16,new Task("knwe", LocalDate.of(2041, 5, 23), Type.NEW, tags.get(1)));
        task.add(17,new Task("we", LocalDate.of(2041, 5, 23), Type.NEW, tags.get(2)));
        task.add(18,new Task("Book", LocalDate.of(2041, 5, 23), Type.NEW,tags.get(4)));
        task.add(19,new Task("we", LocalDate.of(2041, 5, 23), Type.NEW, tags.get(5)));
        task.add(20,new Task("we", LocalDate.of(2041, 5, 23), Type.NEW, tags.get(6)));
        task.add(21,new Task("wefb", LocalDate.of(2041, 3, 23), Type.NEW, tags.get(5)));
        task.add(22,new Task("we", LocalDate.of(2041, 5, 23), Type.NEW, tags.get(6)));
        task.add(23,new Task("we", LocalDate.of(2041, 5, 23), Type.NEW,tags.get(5)));
        task.add(24,new Task("whdke", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(5)));
        task.add(25,new Task("we", LocalDate.of(2041, 6, 3), Type.DONE, tags.get(5)));
        task.add(26,new Task("we", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(5)));
        task.add(27,new Task("Book", LocalDate.of(2041, 5, 23), Type.DONE,tags.get(4)));
        task.add(28,new Task("Book", LocalDate.of(2031, 5, 23), Type.DONE, tags.get(6)));
        task.add(29,new Task("hkwe", LocalDate.of(2041, 5, 23), Type.DONE,tags.get(6)));
        task.add(30,new Task("we", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(5)));
        task.add(31,new Task("Book", LocalDate.of(20441, 5, 23), Type.NEW, tags.get(4)));
        task.add(32,new Task("we", LocalDate.of(2044, 5, 23), Type.NEW, tags.get(5)));
        task.add(33,new Task("we", LocalDate.of(2043, 5, 23), Type.NEW, tags.get(6)));
        task.add(34,new Task("hkdwe", LocalDate.of(2041, 5, 23), Type.NEW,tags.get(5)));
        task.add(35,new Task("Book", LocalDate.of(2041, 5, 23), Type.NEW, tags.get(5)));
        task.add(36,new Task("we", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(6)));
        task.add(37,new Task("wrle", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(3)));
        task.add(38,new Task("we", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(5)));
        task.add(39,new Task("whte", LocalDate.of(2041, 5, 23), Type.DONE, tags.get(3)));





        task.stream().filter(c -> c.getType().equals(Type.DONE)).sorted(Comparator.comparing(Task::getCreationDate)).forEach(c -> System.out.println(c.toString()));


        task.stream().filter(c -> c.getType().equals(Type.DONE)).forEach(c -> System.out.println(c.toString()));

        task.stream().map(m -> m.getTitle()).distinct().forEach(System.out::println);


        task.stream().sorted((o1, o2) -> -o1.getCreationDate().compareTo(o2.getCreationDate()))
                .limit(10).forEach(System.out::println);

        task.stream().filter(t -> t.getTags().equals("book")).filter(t -> t.getType().equals(Type.READING))
                .distinct().forEach(System.out::println);


        long count = task.stream().filter(t -> t.getType().equals(Type.DONE)).count();
        System.out.println(count);

        task.stream().map(Task::getTags).distinct().forEach(System.out::println);

    }



}
