package Zad1;

public class Email implements Powiadomienia{

    @Override
    public void wyslij(String wiadomosc) {
        System.out.println(wiadomosc);
    }
}
