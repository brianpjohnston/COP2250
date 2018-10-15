package Johnston06;

import java.util.Scanner;

/**
 * Brian Johnston
 * Chapter 6
 * 5/23/2016
 * Write a class named MyMath that contains a main method and three static methods as follows:
 * <p>
 * totaldiff method
 * this is a void method that takes two doubles as arguments. This method must print both the total of the double arguments and the positive difference of the arguments.
 * product method
 * this method also takes two doubles as arguments. It must return the product of the arguments back to main, where it will be printed.
 * quotient method
 * this method again takes two doubles as arguments. It must return the quotient of the larger argument divided by the smaller argument back to main, where it will be printed.
 * main method
 * prompt the user to enter two doubles. Then, use these as arguments to call the three methods above. See the example output and duplicate the formats it shows.
 * Example Output
 * Enter two double numbers
 * 6.5 12.5
 * The total of 6.5 and 12.5 is 19.0
 * The positive difference between 12.5 and 6.5 is 6.0
 * 6.5 times 12.5 = 81.25
 * 12.500 divided by 6.500 = 1.923
 * Collaborators: None
 */
public class MyMath {
    public static void main(String[] args) {
        //declaring variables
        double numOne;
        double numTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 numbers"); //prompting for numbers
        numOne = scanner.nextDouble(); //storing num1
        numTwo = scanner.nextDouble(); //storing num 2

        totaldiff(numOne, numTwo); //calling total diff method
        System.out.printf("\nThe Product of %.1f and %.1f is: %.1f", numOne, numTwo, product(numOne, numTwo)); //printing and calling product method

        //determining larger num and calling quotient method
        if (numOne > numTwo) {
            System.out.printf("\nThe quotient of %.1f and %.1f is: %.1f", numOne, numTwo, quotient(numOne, numTwo));
        } else {
            System.out.printf("\nThe quotient of %.1f and %.1f is: %.3f", numTwo, numOne, quotient(numOne, numTwo));
        }


    }

    //method to determine positive difference
    private static void totaldiff(double numOne, double numTwo) {
        double total = numOne + numTwo;
        double difference = Math.abs((numOne - numTwo));
        System.out.printf("The total of %.1f and %.1f is %.1f\nThe positive difference between %.1f and %.1f is %.1f", numOne, numTwo, total, numOne, numTwo, difference);

    }

    ///method determining product
    private static double product(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    //method determining quotient
    private static double quotient(double numOne, double numTwo) {
        double result;
        if (numOne > numTwo) {
            if(numTwo == 0) {
                throw new IllegalArgumentException("Divide by zero error!");
            }
            result = numOne / numTwo;

        } else {
            if(numOne == 0) {
                throw new IllegalArgumentException("Divide by zero error!");
            }
            result = numTwo / numOne;
        }
        return result;

    }
}




