package Zad1;

public class Employee extends Person{
    public String position;
    public void displayData(){
        System.out.println(getLastName() + " " + getFirstName());
    }

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Jack","Sparrow","Kapitan");
    }

}
