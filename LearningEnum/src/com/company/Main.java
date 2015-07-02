package com.company;

import com.sun.tools.javac.jvm.Gen;

public class Main {

    public static void main(String[] args) {
	    Person p = new Person();
        p.gender = Gender.MALE;

        Printer printer = new Printer();
        printer.printerType = PrinterType.DOTMATRIX;

    }

    public static void checkPrinter(Printer printer){

        switch (printer.printerType){
            case DOTMATRIX:
                System.out.println("you have a dotmatrix printer");
                break;
            case INKJET:
                System.out.println("you have an inkjet printer");
                break;
            case LASER:
                System.out.println("you have a laser printer");
                break;
        }
    }


}

/*
class Person{

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int OTHER = 3;

    int gender;

    @Override
    public String toString() {
        String genderString = "Male";
        if(gender == FEMALE)
            genderString = "Female";
        else if(gender == OTHER)
            genderString = "Other";
        return "gender is " + genderString;
    }
}
*/
enum Gender{
    MALE, FEMALE, OTHER
}

class Person{
    Gender gender;

}


enum PrinterType{
    DOTMATRIX, INKJET, LASER
}



class Printer{
    PrinterType printerType;
}





