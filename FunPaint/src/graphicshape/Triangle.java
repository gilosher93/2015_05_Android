package graphicshape;

import appcanvas.Point;
import appcanvas.Segment;
import graphicshape.Shape;

/**
 * Created by eladlavi on 6/15/15.
 */
public class Triangle extends Shape {

    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3){
        setP1(p1);
        setP2(p2);
        setP3(p3);
    }

    @Override
    public double area() {
        Segment base = new Segment(p1, p2);
        return base.distanceFromPoint(p3) * base.length() / 2;
    }

    @Override
    public double perimeter() {
        Segment seg1 = new Segment(p1, p2);
        Segment seg2 = new Segment(p2, p3);
        Segment seg3 = new Segment(p3, p1);
        return seg1.length() + seg2.length() + seg3.length();
    }

    public void drawOnCanvas(boolean[][] canvas){
        Segment seg1 = new Segment(p1, p2);
        Segment seg2 = new Segment(p2, p3);
        Segment seg3 = new Segment(p3, p1);
        seg1.drawOnCanvas(canvas);
        seg2.drawOnCanvas(canvas);
        seg3.drawOnCanvas(canvas);
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
}
