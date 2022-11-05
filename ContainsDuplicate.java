
/*PseudoCode
Get the input array and integer value
check the math condition and iterate using while loop
if condition met , break loop
 */
//Time Complexity O[n]


package junitCodes;

import org.junit.jupiter.api.Test;

public class ContainsDuplicate {
    @Test
    void test1() {
        int[] nums1 ={1,2,3,1};
        int k = 3;
        containsNearbyDuplicate(nums1,k);
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int i=0; int j=nums.length-1;
        int result;
        while(i<nums.length && j<nums.length){
            if(nums[i] == nums[j]){
                result=Math.abs(nums[i]-nums[j]);
                if(result<= k){
                    break;
                }

            }
        }
        return true;
    }
}


