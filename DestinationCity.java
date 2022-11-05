
/*Pseudocode
Get the List of string in ArrayList as input
Initialize map and add the input list of string values
Check condition of string values in map and return the string which doesn't have the key value
 */
// time complexity -O[n^2]


package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DestinationCity {

    //Positive Test
    @Test
    void test1() {
        List<List<String>> input = new ArrayList<List<String>>();
        input.add(Arrays.asList(new String[]{"London","New York"}));
        input.add(Arrays.asList(new String[]{"New York","Lima"}));
        input.add(Arrays.asList(new String[]{"Lima","Sao Paulo"}));
        Assert assert.assertEquals(destCity(input), "Sao Paulo");
        System.out.println(destCity(input));

    }

    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < paths.size(); i++) {
            List<String> s1 = paths.get(i);
            map.put(s1.get(0), s1.get(1));
            //System.out.println(map);
        }
        for (String val : map.values()) {
            if (!map.containsKey(val)) return val;
        }
        return null;

    }

}







