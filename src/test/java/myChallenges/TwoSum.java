package myChallenges;

import java.util.Arrays;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        multiloop:
        for(i=0; i<=nums.length-1; i++){
            for(j=i+1; j<=nums.length-1; j++){
                if(nums[i]+nums[j]==target){
                    break multiloop;
                }
            }
        }
        return new int[] {i, j};
    }

    public static void main(String[] args) {
        int[] i= {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(i,9)));
    }


}
