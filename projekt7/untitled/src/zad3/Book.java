package zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Book implements Comparable<Book>{
    String title;
    int numberOfPages;
    LocalDate publicationDate;

    public Book(String title, int numberOfPages, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "" + numberOfPages;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages,this.numberOfPages);
    }

    public static void main(String[] args) {
        ArrayList<Book> ksiazki = new ArrayList<>();
        ksiazki.add(new Book("Tom 1",800,LocalDate.of(1900,4,5)));
        ksiazki.add(new Book("Tom 2",900,LocalDate.of(1900,4,5)));
        ksiazki.add(new Book("Tom 3",1100,LocalDate.of(1900,4,5)));
        ksiazki.add(new Book("Tom 4",3000,LocalDate.of(1900,4,5)));

        System.out.println(ksiazki);
        Collections.sort(ksiazki);
        System.out.println(ksiazki);

    }

}
