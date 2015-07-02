package appcanvas;

import graphicshape.Shape;

/**
 * Created by eladlavi on 7/2/15.
 */
public class StatusReporter {

    public static Shape.Color getDescriptiveColor(Shape.Color color){
        //anonymous class:
        return new Shape.Color(color){
            @Override
            public String toString() {
                if(alpha<-100)
                    return "transparent";
                if(red>100 && green<100 && blue<100){
                    return "reddish";
                }else{
                    return "bluish";
                }
            }
        };


        //local inner class:
        /*
        class DescriptiveColor extends Shape.Color{
            public DescriptiveColor(Shape.Color color) {
                super(color);
            }

            public void stam(){
                System.out.println("in stam()");
            }

            @Override
            public String toString() {
                if(alpha<-100)
                    return "transparent";
                if(red>100 && green<100 && blue<100){
                    return "reddish";
                }else{
                    return "bluish";
                }
            }
        }


        DescriptiveColor myDescriptiveColor = new DescriptiveColor(color);
        myDescriptiveColor.stam();

        return myDescriptiveColor;
        */
    }
}
