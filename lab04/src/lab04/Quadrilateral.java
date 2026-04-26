package lab04;
public class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Quadrilateral (Point a, Point b, Point c, Point d){
        if (a == null || b == null || c == null || d == null){
            throw new IllegalArgumentException("One point is null!");
        }
        if (a.x == b.x && a.y == b.y || b.x == c.x && b.y == c.y || a.x == c.x && a.y == c.y || 
                d.x == a.x && d.y == a.y || d.x == b.x && d.y == b.y || d.x == c.x && d.y == c.y){
            throw new IllegalArgumentException("Points equal!");
        }
        if (intersect(a, b, c, d) || intersect(b, c, a, d)){
            throw new IllegalArgumentException("Lines intersected!");
        }
        double area = Math.abs(a.x * b.y  + b.x * c.y + c.x * d.y + d.x * a.y - (a.y * b.x  + b.y * c.x + c.y * d.x + d.y * a.x)) / 2;
        if (area < 1e-9){
            throw new IllegalArgumentException("Area equals 0!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    private double side (Point a, Point b, Point p){
        return (b.x - a.x) * (p.y - a.y) - (b.y - a.y) * (p.x - a.x);
    }
    private boolean intersect (Point a, Point b, Point c, Point d){
        double s1 = side(a, b, c);
        double s2 = side(a, b, d);
        double s3 = side(c, d, a);
        double s4 = side(c, d, b);
        return (s1 * s2 < 0) && (s3 * s4 <0);
    }
    @Override
    public double area(){
        return Math.abs(a.x * b.y  + b.x * c.y + c.x * d.y + d.x * a.y - (a.y * b.x  + b.y * c.x + c.y * d.x + d.y * a.x)) / 2;
    }
    @Override
    public Point centroid(){
        double s1 = Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;
        double s2 = Math.abs(a.x * (c.y - d.y) + c.x * (d.y - a.y) + d.x * (a.y - c.y)) / 2;
        double x1 = (a.x + b.x + c.x) / 3;
        double y1 = (a.y + b.y + c.y) / 3;
        double x2 = (a.x + c.x + d.x) / 3;
        double y2 = (a.y + c.y + d.y) / 3;
        double cx = (x1 * s1 + x2 * s2) / (s1 + s2);
        double cy = (y1 * s1 + y2 * s2) / (s1 + s2);
        return new Point (cx, cy);
    }
    @Override
    public String toString(){
        return "Quadrilateral[" + "A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}
