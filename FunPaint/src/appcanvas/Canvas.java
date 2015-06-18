package appcanvas;


import graphicshape.Circle;
import graphicshape.Rectangle;
import graphicshape.Shape;

/**
 * Created by eladlavi on 6/11/15.
 */
public class Canvas {


    public static void main(String[] args) {
        /*
        Circle c = new Circle();
        c.fillColor(123);
        Shape s = new Shape();
        s.fillColor(444);
        Shape s2 = new Circle();
        s2.fillColor(1234);
        s2 = new Rectangle();
        if(s2 instanceof Circle) {
            Circle c2 = (Circle) s2;
            c2.area();
        }else{
            System.out.println("s2 is not a circle");
        }
        System.out.println("end");
        */

        //Shape myShape = new Circle();
        //myShape.fillColor(123);

        /*
        Shape[] myShapes = new Shape[3];
        myShapes[0] = new Shape();
        myShapes[1] = new Circle();
        Rectangle rect = new Rectangle();
        rect.height = 20;
        rect.width = 30;
        myShapes[2] = rect;
        System.out.println("the sum of the perimeters is:"
                + Shape.sumOfShapes(myShapes));
        */


        Circle c1 = new Circle();
        //c1.fillColor(12);
        byte red = 60;
        byte green = 28;
        byte blue = -30;
        //c1.fillColor(red, green, blue);


        Circle c2 = null;
        //doSomthingWithCircle(c2);




        System.out.println(new Circle(3, 4).toString());

    }

    public static void doSomthingWithCircle(Circle c){
        if(c != null)
            c.fillColor(1234);
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





