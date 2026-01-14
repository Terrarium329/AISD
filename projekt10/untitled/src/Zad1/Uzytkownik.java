package Zad1;

public class Uzytkownik {

    private Email email;

    public Uzytkownik(Email email) {
        this.email = email;
    }

    public void powiadomOModernizacji(String informajca){
        email.wyslij(informajca);
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
