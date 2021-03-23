package com.sparta.abdul;

public class Fibonacci {
    /**
     *The method below is used to work out the fibonacci sequence, with the first 2 values being specified by the user
     * @param noOfTerms
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    public static int[] fibonacci(int noOfTerms, int firstNumber, int secondNumber){
        int lengthOfList = noOfTerms;
        int[] fibonacciArray = new int[lengthOfList];
        fibonacciArray[0] = firstNumber;
        fibonacciArray[1] = secondNumber;
        for(int i=2; i < lengthOfList; i++){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }
        return fibonacciArray;
    }
}
