
/*PseudoCode
Get the input string
Initialize the map and add all the 26 letters encoding code
Then iterate through the input as each string and ecode
Then add the encode in set and assign to int variable count
then return the count*/

//Time Complexity O[n]


package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MorseCode {
    @Test
    void test1() {
        String[] words = {"gin", "zen", "gig", "msg"};

    }

    String[] alphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-.."
            , "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
    Set<String> uniqueRepresentations = new HashSet<>();

        for(String word :words)
    {
        StringBuilder newWord = new StringBuilder();
        for (char character : word.toCharArray())
            newWord.append(alphabet[character - 'a']);

        uniqueRepresentations.add(newWord.toString());
    }
        return uniqueRepresentations.size();
}

   /* public int uniqueMorseRepresentations(String[] words) {

        Map<Character,String> encode = new HashMap<Character,String>();
        char[] chars={a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
        String[] codes={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}

        for(int i=0;i<codes.length;i++){
            encode.put(chars[i],codes[i]);
        }
            for(int i=0; i<words.length;i++){

            }




    }*/

