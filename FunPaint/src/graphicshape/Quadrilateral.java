package graphicshape;

import appcanvas.Point;
import appcanvas.Segment;

/**
 * Created by eladlavi on 6/29/15.
 */
public class Quadrilateral extends Shape {

    private Point p1,p2,p3,p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    @Override
    public final double perimeter() {
        Segment seg1 = new Segment(p1, p2);
        Segment seg2 = new Segment(p2, p3);
        Segment seg3 = new Segment(p3, p4);
        Segment seg4 = new Segment(p4, p1);
        return seg1.length() + seg2.length() + seg3.length() +
                seg4.length();
    }

    @Override
    public double area() {
        return 0;
    }
}
