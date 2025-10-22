package zad1;

public class test2 {
    public String firstName;
    public String lastName;

    public test2(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public static void main(String[] args){

        test2 osoba1 = new test2("Guy","123");


        System.out.println(osoba1.firstName + " " + osoba1.lastName);

    }
}
