package zad1;

import demo.WorkTool;

public abstract class ComputerGraphic {
    int width;
    int height;
    String fileName;

    public ComputerGraphic(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }

    public ComputerGraphic(){
    }

    public abstract void loadFile();

    public abstract void saveFile();

}
