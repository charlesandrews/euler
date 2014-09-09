package me.charlesandrews.euler.problem3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charles.andrews on 09/09/2014.
 */
public class PrimeFactorisation {

    public List<Integer> primeFactors = new ArrayList<>();

    public List<Integer> getPrimeFactors(long target)
    {
        for (int i = 2; i <= target; i++) {
            while (target % i == 0) {
                primeFactors.add(i);
                target /= i;
            }
        }
        return primeFactors;
    }

    public static void main(String[] args)
    {
        PrimeFactorisation pf = new PrimeFactorisation();
        System.out.println(pf.getPrimeFactors(600851475143L));
    }
}
