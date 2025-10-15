package zad5;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private int salary;

    public Employee(String firstName,String lastName, String position, int age, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }



    public void showInformation(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.position);
        System.out.println(this.age);
        System.out.println(this.salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
