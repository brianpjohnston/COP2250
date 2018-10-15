package Johnston07and08;

/**
 * cop2250
 * 5/31/16 1:51 PM
 */
public class VarArgFunction {
    public static void main(String[] args) {
        doStuff(args);
    }

    private static void doStuff(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
