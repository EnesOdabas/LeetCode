package myChallenges;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {
    /*
    Given an array of integers numbers that is already sorted in ascending order,
    find two numbers such that they add up to a specific target number.

    Example 1:
     Input: numbers = [2,7,11,15], target = 9
    Output: [1,2]
    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     */
    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<=numbers.length-1; i++){
            for(int j=i+1; j<=numbers.length-1;j++){
                if(numbers[i]+numbers[j]>target){
                    break;
                }else if(numbers[i]+numbers[j]==target){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int [] i={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(i,9)));
    }

}
