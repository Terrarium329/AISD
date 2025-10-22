package zad1;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.isBlank()) {
            this.firstName = "n/n";
        }else{
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isBlank()) {
            this.lastName = "n/n";
        }else{
            this.lastName = lastName;
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



    @Override
    public String toString(){
        return "Person: " + this.firstName + ", Age: " + this.age;
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Person otherPerson)){
            return false;
        }
        //Person otherPerson = (Person) other;
        if (this.getFirstName().equals(otherPerson.getFirstName()) &&
                this.getAge() == otherPerson.getAge() &&
                this.getLastName().equals(otherPerson.getLastName())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getFirstName(),getLastName(),getAge());
    }

    public Person(String firstName, String lastName, int age){
        if(age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }
        if(firstName == null || firstName.isBlank()) {
            this.firstName = "n/n";
        }else{
            this.firstName = firstName;
        }
        if(lastName == null || lastName.isBlank()) {
            this.lastName = "n/n";
        }else{
            this.lastName = lastName;
        }
    }


    public static void main(String[] args){

        Person person1 = new Person("Paul","Sus",48);
        System.out.println(person1.toString());

    }

}
