package sandbox;

public class Point {
    public double p1;
    public double p2;

    public Point() {

        this.p1 = pointOne(4, 6);
        this.p2 = pointTwo(4, 8);
    }

    public double pointOne(double a1, double a2) {
        return a1 * a2;
    }

    public double pointTwo(double a3, double a4) {
        return a3 * a4;
    }

    public double distance() {
        return Math.sqrt(this.p1 * this.p2);
    }
}

