package com.alexanderschelchere;
import java.util.Scanner;
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Please enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Please enter 14 integers: ");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++ )
            baseData[i] = sc.nextInt();
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray() {
        int[] originalArr = baseData;

        baseData = new int[14];
        for (int i = 0; i < originalArr.length; i++)
            baseData[i] = originalArr[i];
    }
}
