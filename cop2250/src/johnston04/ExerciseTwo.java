package johnston04;



/**
        * Brian Johnston
 *
        *Chapter 4
        * 5/18/2016
        *  Print Java on a line, but character-by-character not as a string, and by using only Unicodes. Refer to textbook Section 4.3.1 and an ASCII table online.
        * */


public class ExerciseTwo {
    public static void main(String[] args) {
        //declaring variables
        char j = '\u004A';
        char a = '\u0061';
        char v = '\u0076';
        System.out.print(j);
        System.out.print(a);
        System.out.print(v);
        System.out.print(a);

        //
        // alternative method of printing the word 'Java' character by character.
//        char[] java = new char[] {'\u004A', '\u0061','\u0076', '\u0061'};
//        for (int i = 0; i < java.length; i++) {
//            System.out.print(java[i]);
//        }
        //
        // more alternative ways to print Strings as character arrays
//        String word = "Java";
//        for (char c : word.toCharArray()) {
//            System.out.print(c);
//        }
//
//        for (int i = 0; i < word.length(); i++) {
//            System.out.print(word.charAt(i));
//        }
    }

}
