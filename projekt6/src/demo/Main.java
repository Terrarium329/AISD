package demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<WorkTool> narzedzia = new ArrayList<>();


        WorkTool mlotek = new Hammer("Młotek",2020);
        WorkTool pila = new Saw("Piła",2010);
        WorkTool srubokret = new Screwdriver("Śrubokręt",2015);

        narzedzia.add(mlotek);
        narzedzia.add(pila);
        narzedzia.add(srubokret);

        mlotek.use();
        pila.use();
        srubokret.use();

        System.out.println(mlotek.getClass().getName());

        for(WorkTool narzedzie : narzedzia){
            narzedzie.use();
        }

        WorkTool klucz10 = new WorkTool("Klucz 10 płaski",2016) {
            @Override
            public void use() {
                System.out.println("Zgubiono klucz 10");
            }
        }; //  <---- bardzo ważny średnik w tym miejscu, ponieważ to nadal jest deklaracja klucza10
        // coś tam deklaracja albo klasa anonimowa
        System.out.println(klucz10.getClass().getName());

    }
}
