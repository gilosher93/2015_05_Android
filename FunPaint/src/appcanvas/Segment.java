package appcanvas;

/**
 * Created by eladlavi on 6/25/15.
 */
public class Segment {
    private Point p1;
    private Point p2;
    private double length;
    private boolean lengthCalculated = false;

    public Segment(Point p1, Point p2){
        setP1(p1);
        setP2(p2);
    }

    public Segment(Segment anotherSegment){
        this(anotherSegment.getP1(), anotherSegment.getP2());
    }

    public Point getP1() {
        return new Point(p1);
    }

    public void setP1(Point p1) {
        this.p1 = new Point(p1);
        lengthCalculated = false;
    }

    public Point getP2() {
        return new Point(p2);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
        lengthCalculated = false;
    }

    public double length(){
        if(!lengthCalculated)
            calculateLength();
        return length;
    }

    private void calculateLength(){
        length = p1.distanceFromPoint(p2);
        lengthCalculated = true;
    }

    @Override
    public String toString() {
        return "segment from " + p1.toString() +" to " + p2.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Segment){
            Segment other = (Segment)obj;
            return this.p1.equals(other.p1) && this.p2.equals(other.p2);
        }
        return false;
    }

    public double distanceFromPoint(Point p){
        double x1, y1, x2, y2, x0, y0;
        x1 = this.p1.getXpos();
        y1 = this.p1.getYpos();
        x2 = this.p2.getXpos();
        y2 = this.p2.getYpos();
        x0 = p.getXpos();
        y0 = p.getYpos();

        double temp = x2*y1 + (y2-y1)*x0 -(x2-x1)*y0 - y2*x1;
        if(temp<0)
            temp *= -1;
        return temp / length();
    }

    public double slope(){
        double deltaY = p1.getYpos() - p2.getYpos();
        double deltaX = p1.getXpos() - p2.getXpos();
        if(deltaX == 0){
            return Double.MAX_VALUE; //"infinity"
        }
        return deltaY/deltaX;
    }

    public boolean isPointOnSegment(Point p){
        int leftBorder = p1.getXpos();
        int rightBorder = p2.getXpos();
        if(p1.getXpos() > p2.getXpos()){
            leftBorder = p2.getXpos();
            rightBorder = p1.getXpos();
        }
        int topBorder = p1.getYpos();
        int bottomBorder = p2.getYpos();
        if(p1.getYpos()>p2.getYpos()){
            topBorder = p2.getYpos();
            bottomBorder = p1.getYpos();
        }
        if(p.getXpos()>=leftBorder && p.getXpos()<=rightBorder &&
                p.getYpos()>=topBorder && p.getYpos()<=bottomBorder){
            double d = distanceFromPoint(p);
            return d<0.5;
        }
        return false;
    }


    //x2 * y1 + (x2 - y1)*x0 - (x2-y1)*y0 - y2*x1

    /*
    homework:

    add constructor, one that takes two points,
    and one that takes another Segment and copies it.

    add setters and getters.

    prevent aliasing.

    - add a method that returns the length of the segment (double)

    - distance of a point from the line that this segment is on it.

    - override the methods: equals and toString
    - add a method that will return the slope of the line.
        the slope is delta y divided by delta x



     */
}
