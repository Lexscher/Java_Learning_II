package com.alexanderschelchere;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        getAverage(myIntegers);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Adding " + array[i] + " to " + sum + "...");
            sum += array[i];
            System.out.println("The total is " + sum + ".");
        }
        double average = (double) sum / (double) array.length;
        System.out.println("The average of these " + array.length + " numbers is " + average + ".");
        return average;
    }

}
/*
Enter 5 integer values.
38
12
94
22
5
Element 0, typed value was 38
Element 1, typed value was 12
Element 2, typed value was 94
Element 3, typed value was 22
Element 4, typed value was 5
Adding 38 to 0...
The total is 38.
Adding 12 to 38...
The total is 50.
Adding 94 to 50...
The total is 144.
Adding 22 to 144...
The total is 166.
Adding 5 to 166...
The total is 171.
The average of these 5 numbers is 34.2.
 */