package challenges;
import java.util.ArrayList;
public class NumberFour {

    /**
     * A left rotation operation on an array shifts each of the array's elements to the left the specified number of
     * times. For example, if leftRotation is called with 2 rotations on array [1, 2, 3, 4, 5], then the array would
     * become [3, 4, 5, 1, 2].
     * <p>
     * throw new UnsupportedOperationException();
     * <p>
     * Given an array of integers and a number, rotations, return an array after the left rotations have occurred.
     *
     * @param input     - the array of integers to rotate
     * @param rotations - the number of left rotations to perform
     * @return an array with the specified number of left rotations performed
     * <p> +2
     *      */

     public int[] leftRotation(int[] input, int rotations) {
         int [] output = input;
         for (int i =0; i<rotations; i++) {
             output[i] = input[((i-rotations)+input.length)%input.length];
      }


return output;

      }
}



