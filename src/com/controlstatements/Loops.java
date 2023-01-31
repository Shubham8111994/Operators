package com.controlstatements;

public class Loops {
    public static void main(String[] args) {
        //printing even nos from 1 to 10 range
        System.out.println("Even nos in 1 to 10 are: ");
        for (int i = 2; i<10; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }

        //printing sum of nos 1 to 10 using while
        int sum=0, number=1;
        while(number<=10){
            sum+=number;
        }
        System.out.println("sum of 10 nos are: " + sum);

    }
}
