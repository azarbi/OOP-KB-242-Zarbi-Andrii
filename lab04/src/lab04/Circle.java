package lab04;
public class Circle extends Figure {
    private Point center;
    private double radius;
    public Circle (Point center, double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("Invalid circle!");
        }
        if (center == null){
            throw new IllegalArgumentException("Center is null!");
        }
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double area(){
        return radius * radius * Math.PI;
    }
    @Override
    public Point centroid(){
        return center;
    }
    @Override
    public String toString(){
        return "Circle[" + center + " Radius " + radius + "]";
    }
}
