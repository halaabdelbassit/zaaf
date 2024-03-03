
public class Triangle {

    Point p1;
    Point p2;
    Point p3;

    // two constractors
    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // method to modify the points of the triangle
    public void modifier(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // method peromtre to calculate the perimeter of the triangle
    public double perimetre() {
        double distance1 = p1.longueur(p2);
        double distance2 = p2.longueur(p3);
        double distance3 = p3.longueur(p1);
        double perimetre = distance1 + distance2 + distance3;
        return perimetre;
    }

    // method to check if two triangles are in the same position see if poit are
    // equal
    public boolean samePosition(Triangle t) {
        if (this.p1.equals(t.p1) && this.p2.equals(t.p2) && this.p3.equals(t.p3)) {
            return true;
        } else {
            return false;
        }
    }
}