package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        int[] myIntArr = new int[25];

        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i * 10;
        }
        printArray(myIntArr);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + "'s value is " + array[i]);
        }
    }
}
