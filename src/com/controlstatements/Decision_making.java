package com.controlstatements;

import java.util.Scanner;

public class Decision_making {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter brother's age: ");
        int brotherAge=age.nextInt();
        System.out.println("Enter sister's age: ");
        int sisterAge=age.nextInt();

        //finding older sibling using if else
        if(brotherAge>sisterAge){
            System.out.println("Brother is older");
        } else {
            System.out.println("Sister is older");
        }


        //Finding day using case
        System.out.println("Enter the today's day");
        Scanner day = new Scanner(System.in);
        String today =  day.next();
        switch (today){
    case "Monday": System.out.println("Today is Monday");
    break;
    case "Tuesday": System.out.println("Today is Tuesday");
        break;
    case "Wednesday": System.out.println("Today is Wednesday");
        break;
    case "Thursday": System.out.println("Today is Thursday");
        break;
    case "Friday": System.out.println("Today is Friday");
        break;
    case "Saturday": System.out.println("Today is Saturday");
        break;
    case "Sunday": System.out.println("Today is Sunday");
    break;
    default:
        System.out.println("Plz enter correct day");
}
        //finding older sibling using switch
    }
}
