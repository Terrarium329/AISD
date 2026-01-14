package Zad2;

public class Main {

    public static void main(String[] args) {
        Biuro b1 = new Biuro(new StandardowyPrinter());
        b1.drukujDokument("Faktura VAT");
    }

}
