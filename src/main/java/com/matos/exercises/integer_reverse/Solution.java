package com.matos.exercises.integer_reverse;

public class Solution {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;   // get last digit
            x /= 10;            // remove last digit from x
            rev = rev * 10 + pop;  // add last digit rev
        }
        return rev;
    }

    public static int reverseComplete(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;  // get the last digit
            x /= 10;           // remove the last digit

            // Check for overflow it happens above - Integer.MAX_VALUE = 2147483647
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            // Check for overflow it happens bellow - Integer.MIN_VALUE = -2147483648
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] testCases = {
                123,              // Expected: 321
                -123,             // Expected: -321
                120,              // Expected: 21
                0,                // Expected: 0
                1534236469,       // Expected: 0 (overflow)
                -1534236469,      // Expected: 0 (overflow)
                Integer.MAX_VALUE, // Expected: 0 (overflow)
                Integer.MIN_VALUE, // Expected: 0 (overflow)
                1463847412,       // Expected: 2147483641 (valid)
                -1463847412       // Expected: -2147483641 (valid)
        };

        for (int x : testCases) {
            int result = reverse(x);
            System.out.printf("Input: %d -> Reversed Simple: %d%n", x, result);

            int resultComplete = reverseComplete(x);
            System.out.printf("Input: %d -> Reversed Completed: %d%n", x, resultComplete);
        }
    }
}
