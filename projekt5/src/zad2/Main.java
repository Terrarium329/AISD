package zad2;

public class Main {
    public static void main(String[] args) {
        Address adres1 = new Address("Bałtycka",26,"10-600","Olsztyn");
        System.out.println(adres1);
        Person czlowiek1 = new Person("Ziutek","Ziótkowski",adres1);
        System.out.println(czlowiek1);
    }
}
