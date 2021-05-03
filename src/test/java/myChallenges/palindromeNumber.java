package myChallenges;

public class palindromeNumber {
    /*
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
    For example, 121 is palindrome while 123 is not.
     */
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        int y = x;
        int res = 0;
        while (y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
    }
}
