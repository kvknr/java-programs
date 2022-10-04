package com.company;

public class Main {

    public static void main(String[] args) {

        // Defining the Array
        int[] myFirstIntArray = new int[10];

        //Storing Values of Array Method 1
        int[] myIntArray = new int[10];
        myIntArray[0]=100;
        myIntArray[1]=200;
        //Storing Values of Array Method 2
        int[] myAnotherIntArray={100,200,300,400,500};
        //Storing Values of Array Method 3
        for (int i = 0; i < myFirstIntArray.length; i++) {
            myFirstIntArray[i]=i*10;
        }
        printArray(myFirstIntArray);
        //Note: Always good practice to use length field of Array in for loop


        //Displaying Values of Array
        //Note: Index value always starts from "0"
        System.out.println(myIntArray[0]);

        //How to work with array with other datatype?
        double[] myDoubleArray = new double[10];
        myDoubleArray[5]=100.07;
        System.out.println(myDoubleArray[5]);


    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+i+", value is "+array[i]);
        }
    }
}
