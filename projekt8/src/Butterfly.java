import java.util.ArrayList;

public class Butterfly extends Animal{
    public Butterfly(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ArrayList<Animal> zwierzaki = new ArrayList<>();
        zwierzaki.add(new Cat("Kot"));
        zwierzaki.add(new Dog("Rex"));
        zwierzaki.add(new Butterfly("Motyl"));



        for (Animal zwierze: zwierzaki){
            if (zwierze instanceof LoudAnimal loudAnimal){
                System.out.println(zwierze.name);
                loudAnimal.makeSound();
                loudAnimal.sayName();
            }
        }
    }
}
