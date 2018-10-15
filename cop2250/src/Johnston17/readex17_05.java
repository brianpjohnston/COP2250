package Johnston17;

import java.io.*;


/**
 * Created by brian on 10/14/2016.
 */
public class readex17_05 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_051.dat"));

        ) {
            int[] newNumbers;
            newNumbers = (int[]) (input.readObject());
            System.out.println(newNumbers);
            double doubleValue = input.readDouble();
            System.out.println(doubleValue);
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(date);
        }
    }


}
