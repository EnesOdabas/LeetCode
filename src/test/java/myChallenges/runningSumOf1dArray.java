package myChallenges;

import java.util.Arrays;

public class runningSumOf1dArray {
    /*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Example 1:

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public static int[] runningSum(int[] nums) {
        int runningSum=0;
        int[] runningSums=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            runningSum+=nums[i];
            runningSums[i]=runningSum;
        }
        return runningSums;

    }

    public static void main(String[] args) {
        int [] i={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(i)));
    }
}
