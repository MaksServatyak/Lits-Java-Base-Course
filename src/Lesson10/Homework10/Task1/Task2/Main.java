package Lesson10.Homework10.Task1.Task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Max", 17, "Servatiak", 1000);
        Person person1 = new Person("Max", 17, "Servatiak", 1000);
        System.out.println(person.equals(person1));
    }
}
