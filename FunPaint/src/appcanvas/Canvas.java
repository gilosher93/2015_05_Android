package appcanvas;


import graphicshape.*;

/**
 * Created by eladlavi on 6/11/15.
 */
public class Canvas {


    private static boolean[][] canvas = new boolean[20][60];

    public static void clearCanvas(){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = false;
            }
        }
    }

    public static void drawCanvas(){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        clearCanvas();

        Point p1 = new Point(4, 5);
        Point p2 = new Point(12, 2);
        Segment segment = new Segment(p1, p2);

        segment.drawOnCanvas(canvas);


        drawCanvas();

        /*
        Point p1 = new Point(4, 1);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(100, 8);
        Segment mySegment = new Segment(p1, p2);
        System.out.println(mySegment.distanceFromPoint(p3));
        */

    }

    public static void doSomthingWithCircle(Circle c){
        if(c != null)
            c.fillColor(1234);
    }

    public static double sumOfArea(Shape[] shapes){
        double sum = 0;
        /*
        for(Shape s : shapes){
            if(s instanceof Rectangle){
                Rectangle rect = (Rectangle)s;
                sum += rect.area();
            }else if(s instanceof Circle){
                Circle c = (Circle)s;
                sum += c.area();
            }
        }
        */
        for(Shape s : shapes)
            sum += s.area();

        return sum;
    }

/*
    The type of the pointer, determines which methods are available.
    The actual type of the object, determines which method will
    be executed in runtime.



 */


}







/*
1.
הוסף למחלקה שייפ מתודה שתקרא פרימיטר ותפקידה
להחזיר את היקף הצורה
במקרה של שייפ כללי, יוחזר המספר אפס

2.
בנה את המחלקה של המלבן כך שתייצג מלבן
חשוב בעצמך מהם המאפיינים של מלבן
דרוס את המתודה פרימטר גם במלבן וגם מעגל
היקף מעגל הוא פעמיים הרדיוס כפול פאי
היקף מלבן הוא סכום הצלעות שלו
כלומר פעמיים הסכום של האורך והרוחב

3.
כתוב מתודה סטטית במחלקה שייפ
שתקבל כפרמטר מערך של אובייקטים מסוג שייפ
ותחזיר את סכום ההיקפים של הצורות במערך


*/





