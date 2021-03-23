package com.sparta.abdul;

public class Main {

    public static void main(String[] args) {
        int[] fibonacciArray=null;
        UserIO userinter = new UserIO();
        fibonacciArray = Fibonacci.fibonacci(userinter.noOfTerms(),userinter.getUserInput(),userinter.getUserInput());
        userinter.printSequence(fibonacciArray);
    }
}
