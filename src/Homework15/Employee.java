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
            if (o==null){
                return false;
            }
            if (!(o instanceof Employee)) {
                return false;

            }
            Employee employee=(Employee)o;
            return employee.name==name && employee.age==age;
        }

        @Override
        public int compareTo(Employee o) {
            return this.name.compareTo(o.name);

        }
}

