package com.methods;

public class AddTwoNumbers {

    public int Addition(int firstVal, int secondVal){
      return (firstVal+secondVal); //returning the calculated sum
    }
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        int sum = addTwoNumbers.Addition(2,3); //invoking the method
        System.out.println("The sum is: "+ sum);
    }
}
