package Johnston05;

/**
 * Brian Johnston

 *Chapter 5
 * 5/19/2016
 *  Write a program that prompts for the user's name.  Then, the program must run a method named stringer that takes the name as its only argument. The stringer method must use a loop to display the name backwards. It should also display the name in alphabetical form, and it should return the number of characters in the name to main, where it can be printed.
 *  Collaborators: None
 * */
public class ExerciseTwo {
    public static void main(String[] args) {

        System.out.println("Angle\t\tSine\t\tCosine\t\tTangent");
        System.out.println("-----\t\t----\t\t------\t\t------");
        for (double i = 0; i < 91; i = i + 5) {
            System.out.println((int) i);
            System.out.println((int) i + "\t\t" + String.format("%.5f", (Math.sin(Math.toRadians(i)))) + "        " + String.format("%.5f", (Math.cos(Math.toRadians(i)))) + "        " + String.format("%.5f", (Math.tan(Math.toRadians(i)))));
        }
    }
}
