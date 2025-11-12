package zad3;

public class PointC {
    public double x;
    public double y;

    public PointC(double x, double y){
        this.x = x;
        this.y = y;
    }

    public PointR toPointR(){
        return new PointR(this.x,this.y);
    }

    public PointC toPointC(PointR pkt){
        return new PointC(pkt.x(), pkt.y());
    }

}
