package Homework15;

import java.util.*;

public class Creator {
    String name;
    Integer age;

    public void enterDataForDeveloper() {

        HashSet<Developer> hashSet = new HashSet();
        LinkedHashSet<Developer> linkedHashSet = new LinkedHashSet();
        TreeSet<Developer> treeSet = new TreeSet();


            Scanner scanner = new Scanner(System.in);
            System.out.print("name: ");
            String name = scanner.nextLine();

            System.out.print("age:");
            Integer age = scanner.nextInt();
            scanner.nextLine();

            Developer developer = new Developer(name, age);

            ArrayList<Developer> arrayList = new ArrayList();
            arrayList.add(developer);

            System.out.println(developer);

    }

    public void enterDataForRecruiter() {

        HashSet<Recruiter> hashSet = new HashSet();
        LinkedHashSet<Recruiter> linkedHashSet = new LinkedHashSet();
        TreeSet<Recruiter> treeSet = new TreeSet();


            Scanner scanner = new Scanner(System.in);
            System.out.print("name:");
            String name = scanner.nextLine();

            System.out.print("age:");
            Integer age = scanner.nextInt();
            scanner.nextLine();

            Recruiter recruiter = new Recruiter(name, age);

            ArrayList<Recruiter> arrayList = new ArrayList();
            arrayList.add(recruiter);

            System.out.println(recruiter);
            hashSet.add(recruiter);

    }
}
