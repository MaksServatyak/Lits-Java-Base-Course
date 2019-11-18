package Lesson5;

public class Person {
    public String name;
    public int age;

    private void setAge(int age) {
        if (age<0){
            System.out.println("ERROR");
        }
        this.age = age;
    }
}
