public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void modifier(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("(" + x + "," + y + ")");
    }

    public double longueur(Point p) {
        double distance = Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
        return distance;
    }
}
