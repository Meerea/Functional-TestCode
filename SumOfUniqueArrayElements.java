package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SumOfUniqueArrayElements {
    @Test
    void test1() {
       int[] nums = {1,2,3,2};
       sumOfUnique(nums);
    }

        public int sumOfUnique(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])==1){
                    sum=sum+nums[i];
                }
            }
            return sum;
        }
    }

