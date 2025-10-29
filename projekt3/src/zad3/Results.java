package zad3;

import java.util.Arrays;

public class Results {
    public String firstName;
    public String lastName;
    public int[] results;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Results for " + firstName + lastName + ": Average Score = " +
                averageResult + "Results: " ;
    }

    public Results(String firstName, String lastName, int rozmiarTablicy){
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[rozmiarTablicy];
    }
    public double averageResult(){
        int average = 0;
        for (int i = 0;i < this.length();i++)
            average += this.get(i);
        return average  ;
    }

    public void addResult(int index, int result){

    }


}

