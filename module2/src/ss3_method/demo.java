package ss3_method;

import java.math.BigInteger;

public class demo {
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        demo demo = new demo();
        System.out.println(demo.isPrime(13));
    }
}
