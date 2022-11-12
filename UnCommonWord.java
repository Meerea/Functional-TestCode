package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnCommonWord {
    @Test
    void test1() {
      String  s1 = "this apple is sweet";
       String s2 = "this apple is sour";
        uncommonFromSentences(s1,s2);
    }
        public String[] uncommonFromSentences(String s1, String s2) {
            int x=0;
            String twoStr=s1.concat(s2);
            String[] input=twoStr.split(" ");
            Map<String,Integer> map= new HashMap<>();
            for(int i=0;i<input.length;i++){
                map.put(input[i],map.getOrDefault(input[i],0)+1);
            }
            for (int i=0;i<input.length;i++){
                if(map.get(input[i]) == 1){
                    input[x++]=input[i];

                }
            }
            return input;
        }
    }


/*Pseudocode
1.Declare map and add all the string s1 & s2 words in it
2.Then check the value of word which has exactly as 1, return the word or words
*/

