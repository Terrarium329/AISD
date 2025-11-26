package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ComputerGraphic> lista = new ArrayList<>();

        ComputerGraphic bitmap1 = new Bitmap(100,200,"B1");
        ComputerGraphic bitmap2 = new Bitmap(100,200,"B2");
        ComputerGraphic vector1 = new Vector(200,300,"V1");
        ComputerGraphic vector2 = new Vector(100,300,"V2");
        ComputerGraphic vector3 = new Vector(50,0,"V3");

        lista.add(bitmap1);
        lista.add(bitmap2);
        lista.add(vector1);
        lista.add(vector2);
        lista.add(vector3);

        for(ComputerGraphic i : lista){
            i.saveFile();
            i.loadFile();
        }

    }
}
