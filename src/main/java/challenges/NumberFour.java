package challenges;

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
         int [] output = new int [input.length];

         if(rotations-input.length<0) {
             for (int i = 0; i < input.length; i++) {
                 int tempIndex = ((i - rotations) + (input.length)) % input.length;
                 output[tempIndex] = input[i];
             }
         }
         else {
             for (int i = 0; i < input.length; i++) {
                 int tempIndex = ((i - rotations / 2) + (input.length)) % input.length;
                 output[tempIndex] = input[i];
             }
         }



return output;


}
}




