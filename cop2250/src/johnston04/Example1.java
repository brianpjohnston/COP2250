package johnston04;
public class Example1 {

    public static void main(String[] args) {

        char ch = '\u0041';				// hex 41 = 4 * 16 + 1 = 65

        System.out.println(ch);
        System.out.println(++ch);		// char is a numeric type

        int ch_val = (int)ch;			// casting char type to int type
        System.out.println("ASCII character " + ch + " is " + ch_val);
        System.out.println("Is it an upper case character? " + Character.isUpperCase(ch));

        ch--;							// back to A
        ch += 32;						// can do this, too

        ch_val = (int)ch;				// casting char type to int type again
        System.out.println("ASCII character " + ch + " is " + ch_val);
        System.out.println("Is it an upper case character? " + Character.isUpperCase(ch));

    }

}
