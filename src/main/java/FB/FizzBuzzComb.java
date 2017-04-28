package FB;

import java.util.TreeMap;

/**
 * Created by NickRadonic on 4/24/17.
 */
public class FizzBuzzComb {
    public static void main(String[] args) {
        FizzBuzzComb fb = new FizzBuzzComb();
        fb.run();
        fb.print();
    }

    FizzBuzzComb() {

    }

    private TreeMap k = new TreeMap<Integer, String>();

    public int run() {
        // inherently ordered collection
        final int start = 0;
        final int end = 100;
        int increment = 1;

        // fill array
        for ( Integer i = increment; i <= end ; i += increment){
            k.put(i, i.toString());
        }

        // knock out by 3's
        increment = 3;
        for ( Integer i = increment; i <= end ; i += increment){
            k.put(i, "");
        }

        // knock out by 5's
        increment = 5;
        for ( Integer i = increment; i <= end ; i += increment){
            k.put(i, "");
        }

        // add FIZZ
        increment = 3;
        for ( Integer i = increment; i <= end ; i += increment){
            k.put(i, "FIZZ");
        }

        // add FIZZ
        increment = 5;
        for ( Integer i = increment; i <= end ; i += increment){
            String temp = (String) k.get( i ) + "BUZZ";
            k.put(i, temp );
        }

        return 0;
    }

    enum GOPHER {COUNT, REPLACE, APPEND}

    ;

    private void print() {
        for (Object key : k.keySet()) {
            String v = (String) k.get(key);
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
