public class Triangle2 {
    private Point[] points;

    public Triangle2(Point point1, Point point2, Point point3) {
        points = new Point[3];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
    }

    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length; i++) {
            perimeter += points[i].longueur(points[(i + 1) % points.length]);
        }
        return perimeter;
    }

    public boolean samePosition(Triangle2 other) {
        for (int i = 0; i < this.points.length; i++) {
            if (!this.points[i].equals(other.points[i])) {
                return false;
            }
        }
        return true;
    }
    
}
