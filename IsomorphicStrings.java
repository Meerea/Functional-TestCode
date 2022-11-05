
/*Pseudocode
Get the two strings s and t
then get the length of the two strings and check if there no special characters in both strings
if both length equals then they are isomorphic
*/

//Time complexity O[n]

package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IsomorphicStrings {

    //Positive Test
    @Test
    public void test1(){
        String s = "egg", t = "add";
        isIsomorphic(s, t);

    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();

        for (int i = 0; i < s.length(); i++) {   //paper : title
            char t1 = t.charAt(i);
            if(!map.containsKey(s.charAt(i))) {
                if(map.containsValue(t1)) {
                    return false;
                }
                map.put(s.charAt(i), t1);
            }
            else {
                char s1 = map.get(s.charAt(i));  //get method gives key and return value
                if(s1 != t1) {
                    return false;
                }
            }

        }

        return true;
    }
}

