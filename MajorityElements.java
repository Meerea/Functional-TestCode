
/*Pseudocode
Get the input array
Initialize map in new method and add in map,then check count of characters occurence
Then call the method in implementing method to get the majority element

 */

//Time Complexity O[n^2]

package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    @Test
    void test1() {
      int[] nums1 = {3,2,3};
        majorityElement(nums1);
    }


    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }


    public  Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }


}

