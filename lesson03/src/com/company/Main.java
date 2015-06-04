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
        for (int j = 0; j < x.length; j++) {
            x[j] = 0;
        }
        x[0] = 18;
        x[1] = 100;
        x[2] = -300;

        /*
        for (int j = 0; j < 50; j++) {
            System.out.println(x[j]);
        }
        */

        //System.out.println(sum(x));
        //System.out.println(howManyInRange(x,17,200));
        int[] arr =      {3, 15, 7, 2, 4};
        // {4, 2, 7, 15, 3};

        int[] arrSorted = {2, 3, 4, 7, 15 };

        //int[] result = subArray(arr, 4, 10);
        //int[] result = reverseArray(arr);
        //printArray(result);
        //int a = 1;
        //stam(a);
        //System.out.println("the value of a is: " + a);

        //int[] myArray = {1};
        //stam2(myArray);
        //System.out.println(myArray[0]);
        //reverseArray2(arr);
        //printArray(arr);

        /*
        int[][] myArray2 = new int[3][5];
        myArray2[1][3] = 12;
        for (int j = 0; j < myArray2.length; j++) {
            for (int k = 0; k < myArray2[j].length; k++) {
                System.out.print(myArray2[j][k]+",");
            }
            System.out.println();
        }
        */
        boolean[][] canvas = new boolean[10][12];
        canvas[2][5] = true;
        canvas[4][6] = true;
        canvas[1][3] = true;
        for (int j = 0; j < canvas.length; j++) {
            for (int k = 0; k < canvas[j].length; k++) {
                System.out.print(canvas[j][k] ? "*" : " ");
            }
            System.out.println();
        }

    }

    public static void stam(int x){
        x++;
        System.out.println("the value of x is: " + x);
    }

    public static void stam2(int[] numbers){
        numbers[0]++;
        System.out.println(numbers[0]);
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


    public static int max(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int howManyInRange(int[] numbers, int min, int max){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>=min && numbers[i]<max)
                counter++;
        }
        return counter;
    }

    public static int[] subArray(int[] numbers, int min, int max){
        int[] subArray = new int[howManyInRange(numbers, min, max)];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>=min && numbers[i]<max)
                subArray[counter++] = numbers[i];
        }
        return subArray;
    }

    public static void printArray(int[] numbers){
        System.out.print("[");
        if(numbers.length>0) {
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + ",");
            }
            System.out.print(numbers[numbers.length-1]);
        }
        System.out.println("]");
    }

    public static int[] reverseArray(int[] numbers){
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[numbers.length - i - 1] = numbers[i];
        }
        return reversed;
    }

    public static void reverseArray2(int[] numbers){
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i -1];
            numbers[numbers.length -i -1] = temp;
        }
    }

    public static void sortArray(int[] numbers){

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