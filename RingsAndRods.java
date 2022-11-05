package junitCodes;

import org.junit.jupiter.api.Test;

public class RingsAndRods {
    @Test
    void test1() {
        String rings1 = "B0B6G0R6R0R6G9";
        countPoints(rings1);

    }

    public int countPoints(String rings) {
        int[] arr = new int[6];
        for (int i = 1; i < rings.length(); i += 2) {    //  odd positions

            int index = rings.charAt(i) - '0';
            char c = rings.charAt(i - 1);     // even positions
            if (arr[index] != null) {
                arr[index] += "" + c;
            } else {
                arr[index] = "" + c;
            }
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                String s = arr[i];
                if (s.contains("R") && s.contains("G") && s.contains("B")) {
                    count++;
                }
            }
        }
        return count;

    }
}
