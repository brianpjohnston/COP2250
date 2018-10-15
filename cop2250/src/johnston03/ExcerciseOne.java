package johnston03;
import java.util.Random;
/**
 * Brian Johnston
 *
 *Chapter 3
 * 5/16/2016
 *  Write a program that generates two random integers, both in the range 20 to 50, inclusive. Print both integers and then display the positive difference between the two integers.
 * */
public class ExcerciseOne {
    public static void main(String[] args) {
        Random rand = new Random(); //random variable
        int  n = rand.nextInt(30) + 20; //1st random num
        int  m = rand.nextInt(30) + 20; // 2nd random num
        System.out.println("The first number is: " +n); //outputting first random num
        System.out.println("The second number is: " +m); //outputting second random num
        int answer = 0; //declaring answer variable
        if( n>m){ //determining if 1st number is larger
            answer = n-m; //calculating answer
            System.out.println("The dif between them is: "+ answer); //outputting answer
        }
        else{ //if second number is larger or if even
            answer = m-n; //calculating answer
            System.out.println("The dif between them is: "+ answer); //outputting answer.
        }

    }
}
