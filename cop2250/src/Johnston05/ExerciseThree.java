package Johnston05;

/**
 * Brian Johnston
 *
 *Chapter 5
 * 5/19/2016
 *  Write a Java program that displays the ASCII characters for values from 43 to 120, inclusive. Print at most only 15 characters per line, each character separated from the next by 2 spaces.
 *  Collaborators: None
 * */
public class ExerciseThree {
    public static void main(String[] args) {
        // Create variables
        int lineCount = 0;
        char x;
        char y = 120;


        for (x = 43; x <= y; x++) {
            System.out.print(x + " ");
            lineCount++;

            //
            if (lineCount == 15) {
                System.out.print("\n");
                lineCount = 0;
            }
        }
    }

}
