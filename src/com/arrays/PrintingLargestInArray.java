package com.arrays;

import java.util.Scanner;

public class PrintingLargestInArray {
    public static void main(String[] args) {
    int[] numbers = new int[5];
        System.out.println("Enter the 5 random numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int maxNo = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[0]<numbers[i]){
                maxNo = numbers[i];
            }
        }
        System.out.println("greatest no is " + maxNo);
    }
}
