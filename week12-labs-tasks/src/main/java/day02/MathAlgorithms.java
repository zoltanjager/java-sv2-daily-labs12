package day02;

import java.math.BigInteger;

public class MathAlgorithms {

    public int getGCD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;

    }


    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        System.out.println(mathAlgorithms.getGCD(84, 18));

        BigInteger bi1, bi2, bi3;

        bi1 = new BigInteger("18");
        bi2 = new BigInteger("24");

        bi3 = bi1.gcd(bi2);

        String str = "GCD of " + bi1 + " and " + bi2 + " is " + bi3;

        System.out.println(str);
    }
}
