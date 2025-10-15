package zad1;

public class Person {

    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static void main(String[] args){

        Person osoba1 = new Person("Guy","123");


        System.out.println(osoba1.firstName + " " + osoba1.lastName);

    }

}
