package demo;

public abstract class WorkTool {
    String name;
    int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public WorkTool(){
    }

    public abstract void use();
}
