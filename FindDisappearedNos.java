

//Time Complexity O[n^2]

package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNos {
    @Test
    void test1() {
       int[] nums1 = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers( nums1);

    }


    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                result.add(i+1);
        return result;
    }
}

