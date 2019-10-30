package Lesson10.Homework10.Task1.Task2;

public class Person {
    String firstName;
    int age;
    String lastName;
    int salary;

    public Person(String firstName, int age, String lastName, int salary) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
        this.salary = salary;
    }

        public boolean equals(Person person) {
            if (this == person)
                return true;
            if (person == null)
                return false;
            if (getClass() != person.getClass())
                return false;

            return true;
        }
    }







