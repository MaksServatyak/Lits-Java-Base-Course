package Homework15;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
        int age;
        String name;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return Objects.hash();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return age == employee.age && Objects.equals(name, employee.name);
        }


        @Override
        public int compareTo(Employee o) {
            return this.name.compareTo(o.name);

        }
}
