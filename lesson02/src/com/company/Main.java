package com.company;

public class Main {

    public static void main(String[] args) {
        drawRectangle(50,6);


    }
    public static void exampleOfTrinaryIf(){
        int x = 10;
        /*
        int y;
        if(x<10)
            y = 1;
        else
            y = 2;
        */
        //is the same as:
        int y = x<10 ? 1 : 2;
    }

    // returns the distance between x and y, for example: distance(7,5) is 2
    public static int distance(int x, int y){
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        int result = 0;
        while(small + result < large)
            result++;
        return result;
    }

    //returns the product of two numbers, for example: product(7,5) is 35
    public static int product(int x, int y){
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        int result = 0;
        for (int i = 0; i < small; i++) {
            result += large;
        }
        return result;
    }

    //how many whole times y fits in x
    //for example quotient(7,3) is 2
    public static int quotient(int x, int y){
        if(y==0)
            return -1;
        int result = 0;
        for (int i = y; i <= x ; i+=y)
            result++;

        return result;
    }

    //remainder(7,3) is 1  3*2=6 7-6=1
    public static int remainder(int x, int y){
        if(y==0)
            return -1;
        return distance(x, product(quotient(x, y),y));
    }

    public static int power(int x, int y){
        if(x==0){
            if(y==0)
                return -1;
            return 0;
        }
        if(y==0 || x==1)
            return 1;

        int result = x;
        for (int i = 1; i < y; i++) {
            result = product(result, x);
        }
        return result;
    }

    public static int power2(int x, int y){
        if(x==0){
            if(y==0)
                return -1;
            return 0;
        }
        if(y==0 || x==1)
            return 1;

        return product(power2(x,distance(y,1)),x);

    }

    //sums up the digits of a number
    //for example: sumOfDigits(123) is 6
    public static int sumOfDigits(int x){
        int result = 0;
        while (x>0){
            result += x%10;
            x /= 10;
        }
        return result;
    }

    //finds the highest digit of a number.
    //for example largestDigit(123) is 3
    public static int largestDigit(int x){
        int result = 0;
        while (x>0) {
            int lastDigit = x % 10;
            if (lastDigit > result)
                result = lastDigit;
            x /= 10;
        }
        return result;
    }

    //reverses the digits of a number.
    //for example: reverseDigits(123) is 321
    public static int reverseDigits(int x){
        int result = 0;
        while (x>0) {
            int lastDigit = x % 10;
            result *= 10;
            result += lastDigit;
            x /= 10;
        }
        return result;
    }

    public static void printX(int size){

    }

    public static void drawRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((i==0 || i==height-1 || j==0 || j==width-1) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
/*
power(3, 3)
product(power(3,2),3);
product(product(power(3,1),3),3);
product(product(3,3),3);
product(9,3);
27;




 */