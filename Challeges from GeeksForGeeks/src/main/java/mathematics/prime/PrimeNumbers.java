package mathematics.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    private List<Integer> primes = new ArrayList<Integer>();

    public int greatestPrimeFactor(int num) {
        for(int i=num; i>1; i--) {
            if(this.isPrime(i) && num % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public boolean isPrime(int num) {
        //System.out.println("Is " + num + " Prime?");
        if(num == 2 || num == 3 || num == 5) {
            this.primes.add(num);
            return true;
        }
        else if((num > 2 && this.isRuleOf2(num)) && (num > 3 && this.isRuleOf3(num)) && (num > 5 && this.isRuleOf5(num)) && this.isNotDivisibleByPrimes(num)) {
            this.primes.add(num);
            return true;
        }
        else {
            return false;
        }
    }

    /* Rule of 2 for Prime Numbers:
     * Any number that is even is divisible by 2 is not a prime number (except 2).
     */
    private boolean isRuleOf2(int num) {
        //System.out.println("\t" + num + " meets rule of 2");
        //System.out.println("\t" + num + " does not meet rule of 5 since it's divisible by 2");
        return num % 2 != 0 || num == 2;
    }

    /* Rule of 3 for Prime Numbers:
     * Any number whose sum of digits is divisible by 3 is not a prime number (except 3).
     */
    private boolean isRuleOf3(int num) {
        int sumOfDigits = 0;
        while(num > 0) {
            sumOfDigits += num % 10;
            num = num / 10;
        }

        //System.out.println("\t" + num + " meets rule of 3");
        //System.out.println("\t" + num + " does not meet rule of 5 since it's divisible by 3");
        return sumOfDigits % 3 != 0 || num == 3;
    }

    /* Rule of 5 for Prime Numbers:
     * Any number that ends with a 0 or 5 is divisible by 5 and is not a prime number (except 5).
     */
    private boolean isRuleOf5(int num) {
        //System.out.println("\t" + num + " meets rule of 5");
        //System.out.println("\t" + num + " does not meet rule of 5 since it's divisible by 5");
        return num % 5 != 0 || num == 5;
    }

    /* Rule of Prime Numbers:
     * Prime numbers are not divisible by other prime numbers.
     */
    private boolean isNotDivisibleByPrimes(int num) {
        for(Integer prime : this.primes) {
            if(num % prime == 0) {
                //System.out.println("\t" + num + " does not meet rule of primes since it's divisible by prime number " + prime);
                return false;
            }
        }

        //System.out.println("\t" + num + " meets rule of primes");
        return true;
    }
}
