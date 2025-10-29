package Zad4;

public class Car extends Vehicle{

    public String marka;
    public Car(String marka) {
        this.marka = marka;
    }

    @Override
    public void drive(){
        System.out.println("The car is moving");
        super.drive();
        System.out.println(this.marka);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Dacia");
        c1.drive();
    }
}
