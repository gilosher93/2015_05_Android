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

        /*
        byte r = 18, g = -8, b = 100, a = 127;
        Shape.Color myColor = new Shape.Color(r,g,b,a);
        Shape.Color myOtherColor = StatusReporter.getDescriptiveColor(myColor);
        System.out.println(myOtherColor);
        */

        Parallelogram para = new Parallelogram(){
            @Override
            public double area() {
                return super.area()+1;
            }
            public void stam(){
                System.out.println("in stam...");
            }
        };
        System.out.println("area: " + para.area());


    }

    public static void drawMagenDavid(){
        Triangle triangle1 = new Triangle(new Point(1,10), new Point(40,10),
                new Point(20,28));
        Triangle triangle2 = new Triangle(new Point(1,15), new Point(40,15),
                new Point(20,2));
        triangle1.drawOnCanvas(canvas);
        triangle2.drawOnCanvas(canvas);

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





