package sandbox;

public class Point {
    public double p1;
    public double p2;

    public Point() {
        double a1 = 4; double a2 = 6; double a3 = 4; double a4 = 8;
        this.p1 = a1 * a2;
        this.p2 = a3 * a4;


    }


    public double distance() {
        return Math.sqrt(this.p1 * this.p2);
    }
}
