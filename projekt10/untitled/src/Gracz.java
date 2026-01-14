public class Gracz {
    private Bron bron;

    public Gracz(Bron bron) {
        this.bron = bron;
    }

    public Bron getBron() {
        return bron;
    }

    public void setBron(Bron bron) {
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.atakuj();
        if(bron instanceof Topor){
            System.out.println("To byl topor"); // <--- Błąd merytoryczny. Trza używać metod interfejsów tak jak wyżej
        }
    }

}
