import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int minimumValue(ArrayList<Integer> lista) {
        int najmniejszaLiczba = lista.get(0);

        for (int counter = 0; counter <= lista.size() - 1; counter++) {
            if (najmniejszaLiczba > lista.get(counter)) {
                najmniejszaLiczba = lista.get(counter);
            }
        }
        return najmniejszaLiczba;
    }

// Napisz statyczną metodę countZeros, która przyjmuje listę tablicową liczb całkowitych jako
// argument i zwraca liczbę wystąpień zera w liście tablicowej. Na przykład, dla [0, 1, 2, 0, 3, 0, 4],
// funkcja powinna zwrócić 3. Stwórz przypadek testowy.

    public static int countZeros(ArrayList<Integer> lista){
        int liczbaZer = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i) == 0) {
                liczbaZer++;
            }
        }
        return liczbaZer;
    }

    public static void main(String[] args) {
        int liczba = 0;
        float inna_liczba = 0.5f;
        double kolejna_liczba = 0.4;
        char znak = '\0';
        boolean prawda_falsz = true; // lub false
        long liczba64bit = 0;
        short liczba16bit = 0;
        byte liczba8bit = 0;

        int[] tablicaLiczbCalkowitych = new int[3];
        tablicaLiczbCalkowitych[0] = 4;
        tablicaLiczbCalkowitych[1] = 2;
        tablicaLiczbCalkowitych[2] = 6;

        for (int i = 0; i < 3; i++){
            System.out.println(tablicaLiczbCalkowitych[i]);
        }

        ArrayList<Integer> listaTablicowaIntow = new ArrayList<>();
        listaTablicowaIntow.add(5);
        listaTablicowaIntow.add(3);
        listaTablicowaIntow.add(2);
        listaTablicowaIntow.add(1);
        listaTablicowaIntow.add(10);

        System.out.println(listaTablicowaIntow.get(4));

        System.out.println("-----------------------");

//        Napisz program, który tworzy listę tablicową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia.

        ArrayList<Integer> listaZadanie = new ArrayList<>();
        listaZadanie.add(2);
        listaZadanie.add(4);
        listaZadanie.add(6);
        listaZadanie.add(8);
        listaZadanie.add(10);
        listaZadanie.add(12);
        listaZadanie.add(14);
        listaZadanie.add(16);
        listaZadanie.add(18);
        listaZadanie.add(20);
        for (int j = listaZadanie.size() - 1;j >= 0; j--){
            System.out.println(listaZadanie.get(j));
        }


        ArrayList<Integer> listaT = new ArrayList<>();
        listaT.add(3);
        listaT.add(1);
        listaT.add(5);
        listaT.add(0);
        listaT.add(-4);

        System.out.println(minimumValue(listaT));
        System.out.println(countZeros(listaT));





//        Napisz statyczną metodę minimumValue, która przyjmuje listę tablicową liczb całkowitych jako argument
//        i zwraca najmniejszą liczbę w liście tablicowej. Przyjmij, że lista tablicowa zawsze będzie miała co
//        najmniej jeden element. Stwórz przypadek testowy.

        String napis = "Jakis Napis";
    }

}
