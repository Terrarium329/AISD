package zad1;

public class Teacher implements Cloneable{
    String name;
    String subject;
    int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public Teacher clone(){
        try {
            Teacher clone = (Teacher) super.clone();
            return clone;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Walter White","Chemia",20);
        Teacher t2 = t1.clone();
        System.out.println(t1.experience);
        System.out.println(t2.experience);
        t1.experience = 25;
        System.out.println(t2.experience);
    }

}
