package zad6;

public class PressureSensor implements Sensor{
    double value;
    String status;

    public PressureSensor(double value, String status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public String toString() {
        return "" + value + "->" + status;
    }

    @Override
    public double readValue() {
        return value;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void reset() {
        value = 0;
        status = "None";
    }
}
