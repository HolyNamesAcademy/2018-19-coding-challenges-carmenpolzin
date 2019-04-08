package challenges;
import java.util.ArrayList;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     * <p>
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     * <p>
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     * <p>
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c) {
        ArrayList<Integer> orderedNums = new ArrayList<>();
        int max, mid, min;

        if(a == b && a== c)
            return true;

        if(a==b || a==c) {
            if(a!=c || a!=b)
            return false;
        }

        if (a > b && a > c) {
            orderedNums.add(a);
            if (b > c) {
                orderedNums.add(b);
                orderedNums.add(c);
            } else if (c > b) {
                orderedNums.add(c);
                orderedNums.add(b);
            }
        }

        if (b > a && b > c) {
            orderedNums.add(b);
            if (a > c) {
                orderedNums.add(a);
                orderedNums.add(c);
            } else if (c > a) {
                orderedNums.add(c);
                orderedNums.add(a);
            }
        }

        if (c > a && c > b) {
            orderedNums.add(c);
            if (a > b) {
                orderedNums.add(a);
                orderedNums.add(b);
            } else if (b > a) {
                orderedNums.add(b);
                orderedNums.add(a);
            }
        }

        int diffFirst = (orderedNums.get(0) - orderedNums.get(1));
        int diffSec = (orderedNums.get(1) - orderedNums.get(2));

        if (diffFirst == diffSec) {
            return true;
        } else
            return false;


    }
}
