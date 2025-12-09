package zad5;

//Napisz klasę Person z polami firstName (typu String),
// lastName (typu String) oraz birthDate (typu LocalDate).
// Zaimplementuj generyczny interfejs Comparator do porównywania obiektów po
// polu lastName (alfabetycznie od A do Z),
// a w przypadku równości po polu firstName. Stwórz tablicę
// 5 obiektów klasy Person i posortuj ją zgodnie z opisanym kryterium.


import zad4.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "" + firstName + " " + lastName;
    }

    static void main() {
        ArrayList<Person> ludzie = new ArrayList<>();
        ludzie.add(new Person("Ziut", "Ziótkowski",LocalDate.of(2000,1,1)));
        ludzie.add(new Person("Biut", "Miótkowski",LocalDate.of(2000,1,1)));
        ludzie.add(new Person("Aiut", "Miótkowski",LocalDate.of(2000,1,1)));
        ludzie.add(new Person("Ciut", "Aiótkowski",LocalDate.of(2000,1,1)));
        ludzie.add(new Person("Eiut", "Biótkowski",LocalDate.of(2000,1,1)));
        System.out.println(ludzie);
        ludzie.sort(new GoboSort());
        System.out.println(ludzie);
    }

}
class GoboSort implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if (Character.compare(o1.lastName.charAt(0),o2.lastName.charAt(0)) != 0){
            return Character.compare(o1.lastName.charAt(0),o2.lastName.charAt(0));
        }else{
            return Character.compare(o1.firstName.charAt(0),o2.firstName.charAt(0));
        }
    }
}
