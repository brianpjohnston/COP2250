package johnston03;
import java.util.Scanner;
/**
 * Brian Johnston
 *
 *Chapter 3
 * 5/16/2016
 *  Write a program that prompts the user for a month number and then uses a switch to report the full name of the month. You must use a switch.
 * */
public class ExerciseFour {
    public static void main(String[] args) {
        int month = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number that corresponds to a month: ");
        month = scanner.nextInt();
        String monthName;

            switch (month) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = "Invalid month";
                    break;
            }
            System.out.println(monthName);
        }

    }

