package demo;

import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) { // <-- bardzo ważna kolejność, bo jeżeli null będzie drugi, może być crash
            this.name = "n/n";
        }else{
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person(String name, int age, String city){
        if(age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }
        if(name == null || name.isBlank()) { // <-- bardzo ważna kolejność, bo jeżeli null będzie drugi, może być crash
            this.name = "n/n";
        }else{
            this.name = name;
        }
        this.city = city;
    }
    @Override
    public String toString(){
        return "Imię: " + getName() +
                "\nWiek: " + getAge() +
                "\nMiasto pochodzenia: " + getCity();
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Person otherPerson)){
            return false;
        }
        //Person otherPerson = (Person) other;
        if (this.getName().equals(otherPerson.getName()) &&
        this.getAge() == otherPerson.getAge() &&
        this.getCity().equals(otherPerson.getCity())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(),getAge(),getCity());
    }

    public static void main(String[] args){
        Person person1 = new Person("Ziut",23,"Olsztyn");
        System.out.println("Imię: " + person1.getName() +
                "\nWiek: " + person1.getAge() +
                "\nMiasto pochodzenia: " + person1.getCity());
        System.out.println(person1);
        Person person2 = new Person("OOO",-5,"Olsztyn");
        System.out.println(person1==person2);
        System.out.println(person2);
        System.out.println(person1.equals(person2));
        Person person3 = new Person("OOO",-5,"Olsztyn");
        System.out.println(person2.equals(person3));
    }
}

