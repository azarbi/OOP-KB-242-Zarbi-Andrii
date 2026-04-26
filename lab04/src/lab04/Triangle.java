package lab04;
public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;
    public Triangle (Point a, Point b, Point c){
        if (a == null || b == null || c == null){
            throw new IllegalArgumentException("One point is null!");
        }
        if (a.x == b.x && a.y == b.y || b.x == c.x && b.y == c.y || a.x == c.x && a.y == c.y){
            throw new IllegalArgumentException("Points equal!");
        }
        double S = Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;
        if (S < 1e-9){
            throw new IllegalArgumentException("Invalid triangle!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        return Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;
    }
    @Override
    public Point centroid(){
        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;
        return new Point (x, y);
    }
    @Override
    public String toString(){
        return "Triangle[" + "A" + a + " B" + b + " C" + c + "]";
    }
}
