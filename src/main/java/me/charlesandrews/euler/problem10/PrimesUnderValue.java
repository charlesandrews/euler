package me.charlesandrews.euler.problem10;

import me.charlesandrews.euler.utils.Primes;

/**
 * Created by Charles on 12/8/14.
 */
public class PrimesUnderValue
{

    public long sumPrimesUnderValue(int v)
    {
        long sum=0;

        for (int i = 0; i<v;i++)
        {
            if (Primes.isPrime(i))
            {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        PrimesUnderValue pu = new PrimesUnderValue();
        System.out.println(pu.sumPrimesUnderValue(10));
        System.out.println(pu.sumPrimesUnderValue(2_000_000));
    }

}
