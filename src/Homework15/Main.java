package Homework15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Max",45);
        Employee employee1 = new Employee("Dan",18);
        Employee employee2 = new Employee("Semen",54);
        Employee employee3 = new Employee("Roma",88);
        Employee employee4 = new Employee("Andrii",13);


        System.out.println(employee.compareTo(employee1));
        System.out.println(employee3.compareTo(employee2));
        System.out.println(employee.compareTo(employee3));
        System.out.println(employee.compareTo(employee4));

        HashSet<Employee> hashSet = new HashSet();
        hashSet.add(employee);
        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        hashSet.add(employee4);
        System.out.println(hashSet);

        LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(employee);
        linkedHashSet.add(employee1);
        linkedHashSet.add(employee2);
        linkedHashSet.add(employee3);
        linkedHashSet.add(employee4);
        System.out.println(linkedHashSet);

        TreeSet<Employee> treeSet = new TreeSet();
        treeSet.add(employee);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        System.out.println(treeSet);

        Creator creator = new Creator();
        creator.enterDataForDeveloper();
        creator.enterDataForRecruiter();

    }
}
