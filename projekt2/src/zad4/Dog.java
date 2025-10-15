package zad4;

import zad3.Point;

public class Dog {

    public String name;
    public int age;
    public String breed;

    public Dog(String name, int age, String breed){

        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public Dog(String name, String breed){
        this(name,1,breed);
    }

    public static void main(String[] args){

        Dog d1 = new Dog("Rex","Husky");

        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.breed);

        Dog d2 = new Dog("Azor",5,"Owczarek Niemiecki");

        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.breed);


    }


}
