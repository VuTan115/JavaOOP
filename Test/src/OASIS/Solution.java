package OASIS;

import java.util.Scanner;

public class Solution {
    /**
     * @param a - int number
     * @param b - int number
     * @return int type
     */
    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        Solution ans = new Solution();
        System.out.println(ans.gcd(num1, num2));
    }
}
