package zad2;

import zad1.Person;

import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isBlank()) {
            this.brand = "n/n";
        }else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.isBlank()) {
            this.model = "n/n";
        }else{
            this.model = model;
        }
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        if (this.yearOfProduction > 2025){
            this.yearOfProduction = 2025;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public String toString(){
        return "Vehicle: " + this.brand + this.model + ", Year: " + this.yearOfProduction;
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Vehicle otherVehicle)){
            return false;
        }
        //Person otherPerson = (Person) other;
        if (this.getBrand().equals(otherVehicle.getBrand()) &&
                this.getYearOfProduction() == otherVehicle.getYearOfProduction() &&
                this.getModel().equals(otherVehicle.getModel())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(getBrand(),getModel(),getYearOfProduction());
    }

    public Vehicle(String brand, String model, int yearOfProduction){
        if (this.yearOfProduction > 2025){
            this.yearOfProduction = 2025;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
        if(brand == null || brand.isBlank()) {
            this.brand = "n/n";
        }else{
            this.brand = brand;
        }
        if(model == null || model.isBlank()) {
            this.model = "n/n";
        }else{
            this.model = model;
        }
    }

}
