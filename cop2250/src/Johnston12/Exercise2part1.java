package Johnston12;


import java.util.Random;

/**
 * *Brian Johnston
 * 2019405
 * Chapter12
 * Assignment in text document labeled requirements
 * Collaborators: None
 */
public class Exercise2part1 {
    public static void main(String[] args) throws Exception {

        try {
            //create file writeDouble.txt and check if it exists
            java.io.File file = new java.io.File("writeDouble.txt");
            if (file.exists()) {
                System.out.println("File already exists");
                System.exit(0);
            }
            //new instance of printwriter writing to variable file
            java.io.PrintWriter output = new java.io.PrintWriter(file);


            //loop 10 times and create 10 random numbers and write to file
            for (int i = 0; i < 10; i++) {
                Random r = new Random();
                double randomValue = 1 + (10) * r.nextDouble();
                output.println(randomValue);
            }
            //close printwriter
            output.close();
            //catch if no file exists
        } catch (java.io.FileNotFoundException ex) {
            System.out.printf("There is no file");
        }


    }
}
