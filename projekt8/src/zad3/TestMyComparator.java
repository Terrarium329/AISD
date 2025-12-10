package zad3;

public class TestMyComparator implements MyComparator{
    public static void main(String[] args) {
        TestMyComparator t1 = new TestMyComparator();
        System.out.println(t1.compare(7,5));
        System.out.println(t1.compare(7,7));
        System.out.println(t1.compare(1,5));
    }
}
