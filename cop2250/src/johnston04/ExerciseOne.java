package johnston04;

/**
 * Brian Johnston
 *
 * Chapter 4
 * 5/16/2016
 * In triangle ABC below, calculate the hypotenuse AC and angles A and C (in degrees). Express all measures accurate to three decimal places.
 * Collaborators: None
 */

public class ExerciseOne {

    public static void main(String[] args) {
        double base = 5;
        double height = 12;
        double hypotenuse = 0;
        double angleA = 0;
        double angleB = 90;
        double angleC = 0;


        hypotenuse = Math.sqrt((Math.pow(base, 2)) + (Math.pow(height, 2)));
        System.out.println("The hypotenuse is: " + hypotenuse);
        angleA = Math.toDegrees(Math.atan(base / hypotenuse));
        angleC = 180 - angleB - angleA;


        System.out.println("Angle A is " + String.format("%.3f", angleA));
        System.out.println("Angle B is " + String.format("%.3f", angleB));
        System.out.println("Angle C is " + String.format("%.3f", angleC));

    }
}
