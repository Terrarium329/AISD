package zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{

    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.salary);
    }

    @Override
    public String toString() {
        return "" + salary;
    }

    public static void main(String[] args) {

        ArrayList<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(new Employee("Adam1",5000.20,LocalDate.of(2025,1,20)));
        pracownicy.add(new Employee("Adam2",4000.0,LocalDate.of(2025,1,20)));
        pracownicy.add(new Employee("Adam3",5000.80,LocalDate.of(2025,1,20)));
        pracownicy.add(new Employee("Adam4",2000.0,LocalDate.of(2025,1,20)));
        pracownicy.add(new Employee("Adam5",1000.0,LocalDate.of(2025,1,20)));

        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);

    }


}
