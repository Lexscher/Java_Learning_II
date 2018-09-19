package com.alexanderschelchere;
import java.util.Scanner;

public class Main {
    // Find the minimum number in any given array.
    // allow input from the console to determine how long the array is, and what the values are.
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many items do you want in your array? ");
        int count = scanner.nextInt();

        int[] userArray = readIntegers(count);
        int minNum = findMin(userArray);

        System.out.println("The minimum number in your array is " + minNum);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if( value < min ) {
                min = value;
            }
        }
        return min;
    }
}

/*
  CONSOLE:
    How many items do you want in your array?
    7
    Enter a number:
    55
    Enter a number:
    90
    Enter a number:
    12
    Enter a number:
    43
    Enter a number:
    4
    Enter a number:
    8
    Enter a number:
    14
    The minimum number in your array is 4
 */