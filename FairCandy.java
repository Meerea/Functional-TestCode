package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandy {
    @Test
    void test1() {
      int[]  aliceSizes = {1,1};
      int[]  bobSizes = {2,2};
        fairCandySwap(aliceSizes,bobSizes);
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice=0,sumBob=0,avg=0,result=0;
        Set<Integer> set=new HashSet<>();
        int[] output=new int[2];
        int x=0;
        for(int i=0;i<aliceSizes.length;i++){
            sumAlice+= aliceSizes[i];
            set.add(aliceSizes[i]);
        }
        for(int i=0;i<bobSizes.length;i++){
            sumBob+= bobSizes[i];
        }
        avg=(sumAlice+sumBob)/2;
        for(int i=0;i<bobSizes.length;i++){
            result= avg-bobSizes[i];
            if(set.contains(result)){
                output[x++]=result;
                output[x]=bobSizes[i];
                System.out.println(Arrays.toString(output));
                return output;
            }
        }

    return null;
    }
}
