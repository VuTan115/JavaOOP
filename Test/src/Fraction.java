

import java.util.Scanner;

public class Fraction {
    private int numerator, denominator;
    public static Fraction temp = new Fraction();

    /**
     * initial function 0 parameter.
     */
    public Fraction() {
        denominator = 1;
        numerator = 0;
    }

    /**
     * initial function 2 parameter.
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    /**
     * setter for numerator.
     */
    public int setNumerator(int numerator) {
        return this.numerator = numerator;
    }

    /**
     * setter for denominator.
     */
    public int setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
        return this.denominator;
    }

    /**
     * getter for denominator.
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * getter for numerator.
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * ham tim ucln .
     */
    public int GCD(int num1, int num2) {
        return (num2 == 0) ? num1 : GCD(num2, num1 % num2);
    }

    /**
     * ham tim bcnn .
     */
    public int LCM(int num1, int num2) {
        return num1 * (num2 / GCD(num1, num2));

    }

    /**
     * add Function .
     */
    public Fraction add(Fraction fac) {

        this.reduce();
        fac.reduce();

        if (this.denominator == fac.denominator) {
            temp.numerator = this.numerator + fac.numerator;
            temp.denominator = fac.denominator;
        } else {
            temp.numerator = (this.numerator * fac.denominator + fac.numerator * this.denominator) ;
            temp.denominator = fac.denominator * this.denominator;
        }
        return temp.reduce();
    }

    /**
     * sub Function .
     */
    public Fraction subtract(Fraction fac) {

        this.reduce();
        fac.reduce();

        if (this.denominator == fac.denominator) {
            temp.numerator = this.numerator - fac.numerator;
            temp.denominator = fac.denominator;
        } else {
            temp.numerator = (this.numerator * fac.denominator - fac.numerator * this.denominator) ;
            temp.denominator = fac.denominator * this.denominator;
        }
        return temp.reduce();
    }

    /**
     * mul Function .
     */
    public Fraction multiply(Fraction fac) {
        temp.numerator = this.numerator * fac.numerator;
        temp.denominator = this.denominator * fac.denominator;
        return temp.reduce();
    }

    /**
     * div Function .
     */
    public Fraction divide(Fraction fac) {
        temp.numerator = this.numerator * fac.denominator;
        temp.denominator = this.denominator * fac.numerator;
        return temp.reduce();
    }

    /**
     * reduce Function .
     */
    public Fraction reduce() {

        int ucln = GCD(this.denominator, this.numerator);
        if (GCD(this.numerator, this.denominator) > 1) {
            this.denominator = this.denominator / ucln;
            this.numerator = this.numerator / ucln;

        }
        return this;
    }

    /**
     * equals Function .
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {

            Fraction other = (Fraction) obj;
            this.reduce();
            other.reduce();
            if (this.divide(other).numerator == 1 && this.divide(other).denominator == 1) {
                return true;
            }

        }
        return false;
    }

    /**
     * show Function .
     */
    public void show(Fraction fac) {
        if (fac.denominator == 1) {
            System.out.println("Result :" + fac.numerator);
        } else {
            System.out.println("Result :" + fac.numerator + "/" + fac.denominator);
        }

    }

    /**
     * main Function .
     */
    public static void main(String[] args) {
        Fraction test = new Fraction();
        Fraction fac1 = new Fraction(test.numerator, test.denominator);
        Fraction fac2 = new Fraction(test.numerator, test.denominator);
        Scanner input = new Scanner(System.in);
        fac1.numerator = input.nextInt();
        fac1.denominator = input.nextInt();
        System.out.println("===============");
        fac2.numerator = input.nextInt();
        fac2.denominator = input.nextInt();
        test.show(fac1.add(fac2));
        test.show(fac1.subtract(fac2));
        test.show(fac1.multiply(fac2));
        test.show(fac1.divide(fac2));
        System.out.println(fac1.equals(fac2));


    }
}
