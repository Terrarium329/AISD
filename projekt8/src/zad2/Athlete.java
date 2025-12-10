package zad2;

import zad1.Teacher;

import java.util.ArrayList;

public class Athlete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public Athlete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    @Override
    public Athlete clone(){
        try {
            Athlete clone = (Athlete) super.clone();
            return clone;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(20);
        lista.add(22);
        Athlete a1 = new Athlete("A1",lista);
        Athlete a2 = a1.clone();

        a1.lapTimes.set(2,0);
        System.out.println(a1.lapTimes.get(2));
        System.out.println(a2.lapTimes.get(2));

    }
}
