package zad6;

public class SensorTest {
    public static void main(String[] args) {
        PressureSensor p1 = new PressureSensor(1.25,"W granicach normy");
        TemperatureSensor t1 = new TemperatureSensor(5,"Zimno");

        System.out.println(p1.readValue());
        System.out.println(p1.getStatus());
        p1.reset();
        System.out.println(p1.readValue());
        System.out.println(p1.getStatus());

        System.out.println(t1.readValue());
        System.out.println(t1.getStatus());
        t1.reset();
        System.out.println(t1.readValue());
        System.out.println(t1.getStatus());


    }
}
