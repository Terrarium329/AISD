package Zad2;

public class Biuro {
    private StandardowyPrinter printer;

    public Biuro(StandardowyPrinter printer) {
        this.printer = printer;
    }

    public StandardowyPrinter getPrinter() {
        return printer;
    }

    public void setPrinter(StandardowyPrinter printer) {
        this.printer = printer;
    }

    void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }

}
