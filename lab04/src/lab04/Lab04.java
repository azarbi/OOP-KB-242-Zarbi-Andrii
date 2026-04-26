package lab04;
public class Lab04 {
    public static void main(String[] args) {
        Figure t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
        Figure q = new Quadrilateral(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        Figure c = new Circle(new Point(2, 2), 5);
        System.out.println(t);
        System.out.println("Area of triangle: " + t.area());
        System.out.println("Centroid of triangle: " + t.centroid());
        System.out.println(c);
        System.out.println("Area of circle: " + c.area());
        System.out.println("Centroid of circle: " + c.centroid());
        System.out.println(q);
        System.out.println("Area of quadrilateral: " + q.area());
        System.out.println("Centroid of quadrilateral: " + q.centroid());
    }
}
