/*PseudoCode
Get the iput string array email
Initialize Set and split input string using @ symbol and add in new array
Then again split the new array with + symbol and add in new array
Then add the string in set with replacing . symbol and add @ symbol in first splitted array
 */

// Time complexity O[n]


package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {

   //Positive Test
    @Test
    void test1() {
      String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        numUniqueEmails(emails);
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            normalized.add(local[0].replace(".", "") + "@" + parts[1]);
        }
        return normalized.size();
    }
}

