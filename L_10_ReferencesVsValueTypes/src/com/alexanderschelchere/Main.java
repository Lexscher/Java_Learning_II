package com.alexanderschelchere;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("After change, myIntValue = " + myIntValue);
        System.out.println("After change, anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray) );
        System.out.println("anotherArray = " + Arrays.toString(anotherArray) );

        anotherArray[0] = 1;

        System.out.println("After change, myIntArray = " + Arrays.toString(myIntArray) );
        System.out.println("After change, anotherArray = " + Arrays.toString(anotherArray) );
        // both variables represent the address pointing to the same array in memory.

        anotherArray = new int[] {4, 5, 6, 7, 8}; // <~ now points to a different array in memory
        modifyArray(myIntArray);

        System.out.println("After modify, myIntArray = " + Arrays.toString(myIntArray) );
        System.out.println("After modify, anotherArray = " + Arrays.toString(anotherArray) );
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }

    /*
    Console Output:
    myIntValue = 10
    anotherIntValue = 10
    After change, myIntValue = 10
    After change, anotherIntValue = 11
    myIntArray = [0, 0, 0, 0, 0]
    anotherArray = [0, 0, 0, 0, 0]
    After change, myIntArray = [1, 0, 0, 0, 0]
    After change, anotherArray = [1, 0, 0, 0, 0]
    After modify, myIntArray = [2, 0, 0, 0, 0]
    After modify, anotherArray = [4, 5, 6, 7, 8]
     */
}
