package appcanvas;


import graphicshape.*;

/**
 * Created by eladlavi on 6/11/15.
 */
public class Canvas {


    public static void main(String[] args) {

        Point p1 = new Point(4,3);
        Circle c1 = new Circle(p1, 18);
        p1.setYpos(14);
        c1.setCenter(p1);
        System.out.println(c1);

        Point hackedCenter = c1.getCenter();
        hackedCenter.setYpos(100);
        System.out.println(c1);
        Point p2 = new Point(p1);

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





