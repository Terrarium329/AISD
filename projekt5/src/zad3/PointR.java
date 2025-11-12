package zad3;

public record PointR(double x, double y) {

    public PointC toPointC(PointR pkt){
        return new PointC(x,y);
    }
}
