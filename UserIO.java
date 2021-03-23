package com.sparta.abdul;
import java.util.Scanner;

public class UserIO {
    int whichValue = 1;
    //Input to figure out what the first 2 values of the sequence will be
    public int getUserInput(){
        System.out.print("Type in value "+whichValue+" of the sequence: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        whichValue++;
        return value;
    }
    //Input to figure out how long the list will be
    public int noOfTerms(){
        System.out.print("Type in how many term you want in the sequence: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;

    }
    //Outputting the array
    public void printSequence(int[] fibonacciArray){
        System.out.print("The fibonacci series is: ");
        for(int value: fibonacciArray){
            System.out.printf("%d ",value);
        }
    }
}
