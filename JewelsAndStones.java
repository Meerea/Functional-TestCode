/*PseudoCode
Get the input strings s1,s2
Initialize Set and add the elements of s1 in it
Iterate through the set and check condition of s1 contains s2
 */

//Time complexity O[n]



package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    @Test
    void test1() {
        String s1 = "aA";
        String s2 = "aAAbbbb";
        numJewelsInStones(s1, s2);

    }
//Brute force
   /* public int numJewelsInStones(String jewels, String stones) {
        int count = 0;   //stones aAAbbbb
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }

            }
        }
        return count;
    }*/

    //Using Set and contains()
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int j = 0; j < stones.length(); j++) {
            if (set.contains(stones.charAt(j))){
                count++;
            }
        }
        return count;
    }

}


