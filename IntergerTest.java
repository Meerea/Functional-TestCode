package junitCodes;

public class IntergerTest {
    
        public int[] twoSum(int[] numbers, int target) {

            int index=0,int i=1, int j=numbers.lenght-1;
            while(i==j){
                if(numbers[i]+ numbers[j]==target){
                    int[] res=new res[2];
                    res[0]=i;
                    res[1]=j;
                }
                i++;
                j++;
            }
        else{
                System.out.println("no indices present");


            }

            return res;
        }

    }
 /* sliding window
int right=1;  int left=1;

for(int right=0;right<numbers.length;right++){
    if(numbers[right]
}





*/





/*Pseudocode
1.initialize variables i=0;j=length -1
2.Iterate through array using for loop and check condition that condition
3.Initialize new int arr of size 2 to get the index values
*/
}
