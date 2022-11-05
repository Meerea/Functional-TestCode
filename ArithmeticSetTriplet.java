/*PseudoCode
Get the Input
Initialize Set and check condition of (num - diff,num - 2 * diff ) numbers availble in input using contains method
The return only the unique values

 */

//Time Complexity O[n]


package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticSetTriplet {

    @Test
    void test1() {

       int[] nums = {0,1,4,6,7,10};
       int diff = 3;
    }
    public int arithmeticTriplets(int[] nums, int diff) {
    Set<Integer> set = new HashSet<>();
    int count = 0;

        for (int num : nums) {
        if (set.contains(num - diff) && set.contains(num - 2 * diff)) {
            count = count + 1;
        }

        set.add(num);
    }

        return count;
}


}


