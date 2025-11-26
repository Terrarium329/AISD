package zad1;

public class Vector extends ComputerGraphic{

    public Vector(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Załadowano wektor " + this.fileName);
    }

    @Override
    public void saveFile() {
        System.out.println("Zapisano wektor " + this.fileName);
    }
}
