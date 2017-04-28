package FB;

/**
 * Created by NickRadonic on 4/28/17.
 */
public class FizzBuzzTernary {
    public static void main(String[] args){
        final int start = 1;
        final int end = 100;

        for (int i = start; i<= end; i++){
            String msg = (i % 3) * (i % 5) == 0 ? ( i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "") : Integer.toString(i);
            System.out.print(msg + " ");
        }
        System.out.println();
    }
}
