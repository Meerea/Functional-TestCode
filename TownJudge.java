package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TownJudge {
    @Test
    void test1() {
        int n = 2;
        int[][] trust = {{1, 2}};
        findJudge(trust, n);
    }

    public Integer findJudge(int[][] trust, int n) {

        Set<Integer> set = new HashSet<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  // val, index
        for (int i = 0; i < trust.length; i++) {
            set.add(trust[i][0]);
            if (map.containsKey(trust[i][1])) {
                map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
            } else {
                map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
            }
        }
        for (Integer e : map.keySet()) {  //set 1,2  map, 3 = 2
            if (map.get(e) == n - 1 && set.contains(e) == false) {
                return e;
            }
        }
        return -1;

    }
}