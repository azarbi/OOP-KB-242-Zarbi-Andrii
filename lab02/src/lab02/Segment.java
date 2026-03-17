package lab02;
import java.util.Scanner;
public class Segment{
    private Point start;
    private Point end;
    public Segment(Point start, Point end){
        this.start = start;
        this.end = end;
        if(start.x == end.x && start.y == end.y){
            throw new IllegalArgumentException("Segment can't have same points.");
        }
    }
    public double length(){
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }
    public Point middle(){
        double midx = (start.x + end.x) / 2;
        double midy = (start.y + end.y) / 2;
        return new Point(midx, midy);
    }
    public Point intersection(Segment another){
        double x1 = start.x;
        double y1 = start.y;
        double x2 = end.x;
        double y2 = end.y;
        double x3 = another.start.x;
        double y3 = another.start.y;
        double x4 = another.end.x;
        double y4 = another.end.y;
        double d = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if(d == 0){
            System.out.println("There is no intersection.");
            return null;
        }
        double px = ((x1*y2 - y1*x2)*(x3 - x4) - (x1 - x2)*(x3*y4 - y3*x4)) / d;
        double py = ((x1*y2 - y1*x2)*(y3 - y4) - (y1 - y2)*(x3*y4 - y3*x4)) / d;
        Point p = new Point(px, py);
        if(px >= Math.min(x1,x2) && px <= Math.max(x1,x2) && py >= Math.min(y1,y2) && py <= Math.max(y1,y2) 
                && px >= Math.min(x3,x4) && px <= Math.max(x3,x4) && py >= Math.min(y3,y4) && py <= Math.max(y3,y4)){
            return p;
        }
        else{
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter start x for first line: ");
        double x1 = in.nextDouble();
        System.out.println("Enter end x for first line: ");
        double x2 = in.nextDouble();
        System.out.println("Enter start y for first line: ");
        double y1 = in.nextDouble();
        System.out.println("Enter end y for first line: ");
        double y2 = in.nextDouble();
        System.out.println("Enter start x for other line: ");
        double x3 = in.nextDouble();
        System.out.println("Enter end x for other line: ");
        double x4 = in.nextDouble();
        System.out.println("Enter start y for other line: ");
        double y3 = in.nextDouble();
        System.out.println("Enter end y for other line: ");
        double y4 = in.nextDouble();
        Segment segment1 = new Segment(new Point(x1, y1), new Point(x2, y2));
        Segment segment2 = new Segment(new Point(x3, y3), new Point(x4, y4));
        System.out.println("Length first segment: " + segment1.length());
        System.out.println("Midpoint first segment: " + segment1.middle());
        if (segment1.intersection(segment2) != null){
            System.out.println("Point of intersection: " + segment1.intersection(segment2));
        }
    }
}