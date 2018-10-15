package Johnston12;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * * Brian Johnston
 * 2019405
 * Chapter12
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class Exercise2Part2 {
    public static void main(String[] args) throws Exception {
        try {
            //creating file instance
            java.io.File file = new java.io.File("writeDouble.txt");

            //declaring variables
            Scanner input = new Scanner(file);
            double sum = 0;
            //while loop prints doubles and adds to sums
            while (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.println(next);
                sum += next;


            }
            //prints sums
            System.out.printf("The total is: %.2f ", sum);

            //catch if file is not found
        } catch (java.io.FileNotFoundException ex) {
            System.out.println("There is no file");
        }


    }
}
