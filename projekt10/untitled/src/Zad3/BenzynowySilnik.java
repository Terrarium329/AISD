package Zad3;

public class BenzynowySilnik implements Silnik{

    @Override
    public void uruchom() {
        System.out.println("Uruchomiono!");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymano...");
    }
}
