package FB;

/**
 * Created by NickRadonic on 4/25/17.
 */
public class OnceThrough {
    public static void main(String[] args) {
        final int start = 1;
        final int end = 100;
        final int increment3 = 3;
        final int increment5 = 5;
        final int product = 3 * 5;

        String fizz = "Fizz";
        String buzz = "Buzz";

        String result = "";
        for (int index = start; index <= end; index++) {
            if (index % product == 0) {
                result += fizz + buzz + " ";
            } else if (index % increment3 == 0) {
                result += fizz + " ";
            } else if (index % increment5 == 0) {
                result += buzz + " ";
            } else {
                result += Integer.toString(index) + " ";
            }
        }
        System.out.println(result);
    }
}


