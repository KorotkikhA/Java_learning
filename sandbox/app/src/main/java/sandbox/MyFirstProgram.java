package sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + " = " + r.area());

        Point p = new Point();
        System.out.println("Рассотояние между точкой " + p.p1 + " и " + p.p2 + " является " + p.distance());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }

}
