package com.arrays;

import java.util.Scanner;

public class SmallestNumberInArray {
    //Program to find 2nd largest and smallest no in an array
    public static void main(String[] args) {


    int[] numbers=new int[5];
    Scanner input = new Scanner(System.in);
                System.out.println("Enter the 5 random numbers");
                for (int i = 0; i <5; i++) {
        numbers[i]=input.nextInt();
    }
    int temp; //for swapping greatest and smallest number
                System.out.print("Sorted array is: ");
    //Loop to iterate
                for (int i = 0; i < numbers.length; i++) {
        for (int j = i+1; j < numbers.length; j++) {
            if (numbers[i] < numbers[j]) {// condition checking smallest among 2 numbers
                temp=numbers[j];
                numbers[j]=numbers[i];
                numbers[i]=temp;
            }
        }
        System.out.print(numbers[i]+" ");
    }
                System.out.println();
                System.out.println("smallest no is: "+ numbers[numbers.length-1]);
}
}