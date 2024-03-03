//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Triangle> pTriangles = new ArrayList<>();
        Point[] points = new Point[3];
        // declaration of 3 traingle
        Triangle t1 = new Triangle(new Point(3, 2), new Point(4, 2), new Point(4, 5));
        pTriangles.add(t1);
        Triangle t2 = new Triangle(new Point(4, 2), new Point(5, 3), new Point(1, 0));
        pTriangles.add(t2);
        Triangle t3 = new Triangle(new Point(5, 3), new Point(1, 0), new Point(4, 2));
        pTriangles.add(t3);
        // print the 3 triangles
        // System.out.println("Perimeter of t1: " + t1.perimetre());
        // System.out.println("Perimeter of t2: " + t2.perimetre());
        // System.out.println("Perimeter of t3: " + t3.perimetre());

        for (Triangle triangle : pTriangles) {
            System.out.println("Perimeter of t"+(pTriangles.indexOf(triangle)+1) +": " + triangle.perimetre());
        }
        // check if triangle are in same position
        // System.out.println("t1 and t2 are in same position: " + t1.samePosition(t2));
        // System.out.println("t2 and t3 are in same position: " + t2.samePosition(t3));


    
    }
}