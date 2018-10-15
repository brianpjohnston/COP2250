package Johnston06;

import java.util.Scanner;

/**
 * Brian Johnston
 * Chapter 6
 * 5/25/2016
 * Write an original program with a main method and at least two methods that demonstrate method overloading.
 * Execute all of the overloaded methods in the main method. In comments, explain how your methods demo overloading.
 * Collaborators: None
 */
public class Overloading {
    public static void main(String[] args) {
        // create new instance of Overloading Class
        Overloading instance = new Overloading();

        //This calls the 1st mean method - this returns a string value and takes int as param
        System.out.println(instance.mean(5, 15));



        /*
         * This also calls the mean method but the 2nd one which demos overloading because it returns a
         * different variable type, takes different param types and it also takes a different number of param
         */
        System.out.println("THe results of the method that finds the mean of 5, 15, and 17 is: " + String.format("%.2f", instance.mean(5, 18, 17)));

    }

    //mean method that returns a string
    private String mean(int num1, int num2) {
        String result;
        int average = (num1 + num2) / 2;
        result = "The string result of the mean of " + num1 + " and " + num2 + " is " + average;
        return result;
    }

    //mean method that returns double and 3 param
    private double mean(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}

