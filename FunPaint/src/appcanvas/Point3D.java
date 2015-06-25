package appcanvas;

/**
 * Created by eladlavi on 6/25/15.
 */
public class Point3D extends Point {

    private int newZ;

    private int zPos;

    public Point3D(int x, int y, int z){
        super(x, y);
        setzPos(z);
    }

    public int getzPos() {
        return zPos;
    }

    public void setzPos(int zPos) {
        this.zPos = zPos;
    }

    @Override
    protected String componentsByComma() {
        return super.componentsByComma() + "," + zPos;
    }


    protected double sumOfSquares(int x, int y, int z) {
        int deltaZ = this.zPos - z;
        return sumOfSquares(x, y) + deltaZ*deltaZ;

    }


    public double distanceFromPoint(int x, int y, int z) {
        newZ = z;
        //return Math.sqrt(sumOfSquares(x, y, z));
        return distanceFromPoint(x, y);
    }

    @Override
    protected double sumOfSquares(int x, int y) {
        return sumOfSquares(x, y, newZ);
    }

    @Override
    public double distanceFromPoint(Point p) {
        if(p instanceof Point3D){
            Point3D theOtherPoint = (Point3D)p;
            return distanceFromPoint(theOtherPoint.getXpos(),
                    theOtherPoint.getYpos(), theOtherPoint.getzPos());
        }else {
            return distanceFromPoint(p.getXpos(), p.getYpos(), 0);
        }
    }


    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj) && obj instanceof Point3D){
            Point3D other = (Point3D)obj;
            return this.zPos == other.zPos;
        }
        return false;
    }
}
