package com.company;

public class Main {

    public static void main(String[] args) {
        //drawX(11);
        int i = 100; //4 bytes  -2B   to +2B  (256^4=4B)
        byte b = 127; //1 byte  -128   to 127
        boolean bool = true;  //1 bit
        short s = 100; //2 byte  256^2=65536
        float myFloat = 28.6f;  //4 bytes
        double myDouble = 28.6; //8 bytes;
        long myLong = 234234234234L;  //like int but 8 bytes
        char c = 'e';
        //the RAM has two areas: stack and heap
        //System.out.println(++b);

        String myString = "hello";

        int[] x = new int[50];
        for (int j = 0; j < 50; j++) {
            x[j] = 0;
        }
        x[0] = 18;
        x[1] = 100;
        x[2] = -300;
        for (int j = 0; j < 50; j++) {
            System.out.println(x[j]);
        }
        

    }

    public static void drawX(int size){
        if(size%2 != 0)
            size -= 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (size - i)*2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i*2 + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }

        /*
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.print(i == j || i == size - j ? "*" : " ");
            }
            System.out.println();
        }
        */
    }
}
/*

*           *
 *         *
  *       *
   *     *
    *   *
     * *
      *
     * *
    *   *
   *     *
  *       *
 *         *
*           *



 */