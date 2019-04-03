import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * ArrayShuffle
 */
public class ArrayShuffle {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        System.out.println("before"); 
        for (int i : arr) {
            System.out.println(i);
        }
        Collections.shuffle(arr);
        System.out.println("after"); 
        for (int i : arr) {
            System.out.println(i);
        }

        
    }
}