package zad1;

public class Main {
    public static void main(String[] args) {
        BookTDO ksiazka1 = new BookTDO("KK","What",50.43,2013);
        System.out.println(ksiazka1.title() + " " + ksiazka1.author() + " " + ksiazka1.price() + " " + ksiazka1.yearOfPublication());
        System.out.println(ksiazka1);
        BookTDO ksiazka2 = new BookTDO("KK","What",50.43,1994);
        System.out.println(ksiazka2);
        System.out.println(ksiazka1.equals(ksiazka2));

        BookTDO ksia = new BookTDO("M","L",20.05);
        System.out.println(ksia);
    }
}
