package myChallenges;

public class reverseInteger {
    /*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Example 1;
    Input: x = 123
    Output: 321

    Example 2;
    Input: x = -123
    Output: -321
     */

    public static int reverse(int x) {
        int result=0;
        while(x!=0){
            int temp=x%10;
            int newResult=result*10+temp;
            if((newResult - temp)/10 !=result){
                return 0;
            }
            result=newResult;
            x=x/10;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(reverse(357));
        System.out.println(reverse(-967));

    }

}
