package johnston04;

/**
 * Brian Johnston
 *
 *Chapter 4
 * 5/18/2016
 *  Here is some data regarding an employee:
 *name: George
  *age:29
 *hourly pay rate: $48.50
 *office: C
 * Assign all four of these data items to suitable Java variables, then use the variables and three statements to print these formatted lines of output exactly as shown below. NOTE: The gross pay is a calculated variable.
 *
 * George is 29 years old
 *He works in office C
 *In a 40-hour week, his gross pay is $1,940.00
 * */
public class ExerciseFour {
    public static void main(String[] args) {
        //declaring variables
        String name = "George";
        int age = 29;
        double payRate = 48.5;
        char office = 'C';
        double grossPay = payRate * 40;

        //printing using printf
        System.out.printf("%s is %d years old", name, age);
        System.out.printf("\nHe works in office %c", office);
        System.out.printf("\nIn a 40 hour week, his gross pay is $%,.2f", grossPay);


    }


}
