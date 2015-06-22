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

    double sumOfSquares(int x, int y){
        int deltaX = x - xPos;
        int deltaY = y - yPos;
        return deltaX*deltaX + deltaY*deltaY;
    }

    @Override
    public String toString() {
        return "(" + componentsByComma() + ")";
    }

    String componentsByComma(){
        return xPos + "," + yPos;
    }

}
