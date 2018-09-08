package com.alexanderschelchere;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] faveNum = getIntegers(5);
        int[] sorted = sortIntegers(faveNum);
        printArray(sorted);
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArr = new int[array.length];
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag=false;

            for(int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    flag = true;
                }
            }
        } // <~ while loop
        return sortedArr;
    } // <~ sortIntegers

}

// CHALLENGE
/*
Create a program using arrays that sorts a list of integers in descending
    order.
Set up the program so that the numbers to sort are read in from the keyboard.
Implement the following methods - getIntegers, printArray, and sortIntegers.
getIntegers returns an array of entered integers from the keyboard.
PrintArray prints out the contents of the array.
sortIntegers should sort the array and return a new array containing the
    sorted numbers.
You will have to figure out how to copy the array elements from the passed array
into a new array and sort them and return the new sorted array.

CONSOLE:
Enter 5 integer values.
50
175
40
21
300
Element 0, typed value was 300
Element 1, typed value was 175
Element 2, typed value was 50
Element 3, typed value was 40
Element 4, typed value was 21
 */
