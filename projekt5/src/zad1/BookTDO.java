package zad1;

import java.time.Year;

public record BookTDO(String title, String author, double price, int yearOfPublication) {

    public BookTDO{
        if (yearOfPublication < 2000){
            yearOfPublication = Year.now().getValue();
        }

    }

    public BookTDO(String title, String author, double price){
        this(title,author,price,Year.now().getValue());
    }

}
