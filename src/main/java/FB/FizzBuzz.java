package FB;

import java.util.TreeMap;

/**
 * Created by NickRadonic on 4/24/17.
 */
public class FizzBuzz {
    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        fb.run();
        fb.print();
    }

    FizzBuzz(){

    }

    private TreeMap k = new TreeMap<Integer, String>();
    public int run(){
        // inherently ordered collection
        final int start = 0;
        final int end = 100;
        Integer increment = 3;
        String msg = "Fizz";
        GOPHER method = GOPHER.REPLACE;

        putNewEntry(k, end, increment, msg, method);

        increment = 5;
        method = GOPHER.APPEND;
        msg = "Buzz";
        putNewEntry(k, end, increment, msg, method);

        increment = 1;
        method = GOPHER.COUNT;
        String labelmsg = "Fizz";
        putNewEntry(k, end, increment, msg, method);

        return 1;
    }

    private void putNewEntry(TreeMap k, int end, int increment, String s, GOPHER method) {
        for( Integer a = increment; a<=end; a+=increment){
            String fromTree = (String)k.get(a);
            if (fromTree == null){
                fromTree = "";
            }

            switch (method){
                case REPLACE: fromTree = s; break;
                case APPEND: fromTree = fromTree + s; break;
                default: if ( fromTree.equals("")){
                    fromTree = a.toString();
                }  break;
            }

            k.put( a, fromTree );
        }
    }

    enum GOPHER{COUNT, REPLACE, APPEND};

    private void print(){
        for (Object key : k.keySet()){
            String v = (String) k.get(key);
            System.out.print(v + " " );
        }
        System.out.println();
    }
}
