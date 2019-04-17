package challenges;
import java.util.ArrayList;
public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {
        if(word1.length()!= word2.length())
            return false;

        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();

        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0; i<word1.length(); i++){
            temp.add(word1.substring(i,i+1));
        }

        for(int i = 0; i<word2.length(); i++)
        if(!word2.contains(temp.get(i)))
            return false;

        return true;
    }
}
