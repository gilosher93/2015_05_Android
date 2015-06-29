package appcanvas;

/**
 * Created by eladlavi on 6/22/15.
 */
public class Point {

    private int xPos;
    private int yPos;

    public Point(int x, int y){
        setXpos(x);
        setYpos(y);
    }

    public Point(Point point){
        this(point.getXpos(), point.getYpos());
    }

    public int getYpos() {
        return yPos;
    }

    public void setYpos(int yPos) {
        this.yPos = yPos;
    }


    public int getXpos() {
        return xPos;
    }

    public void setXpos(int xPos) {
        this.xPos = xPos;
    }

    public double distanceFromPoint(int x, int y){
        return Math.sqrt(sumOfSquares(x, y));
    }

    public double distanceFromPoint(Point p){
        return distanceFromPoint(p.getXpos(), p.getYpos());
    }

    public double distanceFromOrigin(){
        return distanceFromPoint(0, 0);
    }

    protected double sumOfSquares(int x, int y){
        int deltaX = x - xPos;
        int deltaY = y - yPos;
        return deltaX*deltaX + deltaY*deltaY;
    }

    @Override
    public String toString() {
        return "(" + componentsByComma() + ")";
    }

    protected String componentsByComma(){
        return xPos + "," + yPos;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Point){
            Point other = (Point)obj;
            return this.xPos == other.xPos && this.yPos == other.yPos;
        }
        return false;
    }


    public void drawOnCanvas(boolean[][] canvas){
        if(canvas == null)
            return;
        if(canvas.length == 0)
            return;
        if(canvas[0].length == 0)
            return;

        if(this.xPos >= canvas[0].length)
            return;
        if(this.yPos >= canvas.length)
            return;
        canvas[yPos][xPos] = true;

    }
}
