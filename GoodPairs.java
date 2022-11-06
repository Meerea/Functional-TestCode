package junitCodes;

import org.junit.jupiter.api.Test;

public class GoodPairs {
    @Test
    void test1() {
       int[] nums1 = {1,2,3,1,1,3};
        numIdenticalPairs(nums1);
    }
        public int numIdenticalPairs(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j] && i<j){
                        count++;
                    }
                }
            }
            return count;
        }
    }


/*pseudocode
Bruteforce Technique
Get the input array, use for 2 for Loop to iterate and check condition nums[i]==nums[j] and i<j
Initialize count variable to add the no of pairs
*/