package Recursion;

import java.util.Scanner;

public class RecursionChap {
    public void unrecursion(String[] a, String[] rot) {


        for (int i = 0; i < 5; i++) {
            a[0] = "F";
            rot[0] = "F";
            if (i >= 1) {
                a[i] = a[i - 1] + "L" + rot[i - 1];
                rot[i] = a[i - 1] + "R" + rot[i - 1];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }

    public String reverseString(String A) {
        StringBuilder ans = new StringBuilder();
        for (int i = A.length() - 1; i > 0; i--) {
            if (A.equals("L")) ans.append("R");
            else if (A.equals("R")) ans.append("L");
            else ans.append(A);
        }

        return ans.toString();
    }

    public String recursion(int n) {

        if (n == 0) return "F";
        else return recursion(n - 1) + "L" + reverseString(recursion(n - 1)) + "\n";


    }

    public int UCLN(int a, int b) {
        return (b == 0) ? a : UCLN(b,a%b);
    }

    public static void main(String[] args) {

        RecursionChap A = new RecursionChap();

        Scanner input = new Scanner(System.in);
        System.out.println("Type num1:");
        int num1 = input.nextInt();
        System.out.println("\nType num1:");
        int num2 = input.nextInt();
        System.out.println(A.UCLN(num1,num2));

    }
}
