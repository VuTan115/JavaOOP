package OASIS;


import java.util.Scanner;

public class GCD {

    /** primes function.*/
    public void primes(int n) {
        Boolean[] isPrime = new Boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    /** main. */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        GCD ans = new GCD();
        ans.primes(n);


    }
}
