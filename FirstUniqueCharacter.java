package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    @Test
    void test1() {
       String s1 = "leetcode";
        findFirstChar(s1);
    }
public int findFirstChar(String s) {
    int result ;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < s.length(); i++) {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
        if (map.get(s.charAt(i)) == 1) {
           result = 1;
           System.out.println(result);
            return 1;
        }

    }
    return -1;
}
}
