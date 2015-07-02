package graphicshape;

import appcanvas.Point;
import appcanvas.Segment;

import javax.naming.PartialResultException;

/**
 * Created by eladlavi on 6/29/15.
 */
public class Parallelogram extends Quadrilateral {


    public Parallelogram(){
        this(new Point(0,0), new Point(10,0), new Point(10,10),
                new Point(0,10));
    }

    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }



    @Override
    public double area() {
        Segment seg1 = new Segment(getP1(), getP2());
        return seg1.length() * seg1.distanceFromPoint(getP3());
    }
}
