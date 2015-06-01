package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(123 / 10);
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

    public static int quotient(int x, int y){
        if(y==0)
            return -1;
        int result = 0;
        for (int i = y; i <= x ; i+=y)
            result++;

        return result;
    }

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

    public static int sumOfDigits(int x){
        int result = 0;
        while (x>0){
            result += x%10;
            x /= 10;
        }
        return result;
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