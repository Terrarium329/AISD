import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    String imie;
    double sredniaOcen;
    int rokUrodzenia;

//    @Override
//    public int compareTo(Student o) {
//        // 0 oznacza, że oba obiekty są równe
//        // wartości dodatnie oznaczają, że obiekt Student jest więksszy od o
//        // wartości ujemne oznaczają, że obiekt o jest większy od studenta
//        if (this.sredniaOcen > o.sredniaOcen) {
//            return 1;
//        } else if (this.sredniaOcen < o.sredniaOcen) {
//            return -1;
//        } else {
//            return 0;
//        }
//
//    }

//    @Override
//    public int compareTo(Student o){
//        return (int) (this.sredniaOcen - o.sredniaOcen);
//    }

//    @Override
//    public int compareTo(Student o){
//        return Double.compare(this.sredniaOcen, o.sredniaOcen);
//    }

//    compareTo <------- związany z comparable na początku klasy

    @Override
    public int compareTo(Student o){
        if (Double.compare(this.sredniaOcen, o.sredniaOcen)==0){
            return Integer.compare(this.rokUrodzenia,o.rokUrodzenia);
        }else{
            return Double.compare(this.sredniaOcen, o.sredniaOcen);
        }
    }
    public Student(String imie, double sredniaOcen, int rokUrodzenia){
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "" + sredniaOcen + "-" + rokUrodzenia;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam",3.0,1999));
        students.add(new Student("Adam",4.0,1999));
        students.add(new Student("Adam",3.5,1999));
        students.add(new Student("Adam",3.5,1996));

        System.out.println(students);
//        Collections.sort(students);
        students.sort(new AvgGradeStudentComparator());
        System.out.println(students);
        students.sort(new YearOfBirthStudentComparator());
        System.out.println(students);




    }

}

class AvgGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (Double.compare(o1.sredniaOcen,o2.sredniaOcen));
    }
}

class YearOfBirthStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (Integer.compare(o1.rokUrodzenia,o2.rokUrodzenia));
    }
}
