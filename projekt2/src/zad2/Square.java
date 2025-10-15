package zad2;

public class Square {
    public int side;

    public Square(int side){

        this.side = side;

    }

    public Square(){

        this(1);

    }

    public int polePowierzchni(){
        int wynik = side * side;
        return wynik;
    }



    public static void main(String[] args){

        Square sq1 = new Square();
        System.out.println(sq1.side);
        System.out.println(sq1.polePowierzchni());

    }

}
