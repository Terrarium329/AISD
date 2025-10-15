import zad6.BankAccount;

public class Main {


    public static void main(String[] args){

        BankAccount a1 = new BankAccount(1,"John Smith",300,"Firmowy");
        a1.deposit(20);
        a1.print();
        a1.withdraw(50);
        a1.print();

    }
}