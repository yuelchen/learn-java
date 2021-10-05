package mathematics.fractions;

import mathematics.lcm.LCM;

public class Fractions {
    public String addTwoFactions(int numer1, int denom1, int numer2, int denom2) {
        //find the lowest common multiple for the denominators
        int lcm = this.getLCM(denom1, denom2);
        numer1 *= lcm / denom1;
        numer2 *= lcm / denom2;

        return (numer1 + numer2) + "/" + lcm;
    }

    private int getLCM(int denom1, int denom2) {
        LCM lcm = new LCM();
        return lcm.calculate(denom1, denom2);
    }
}