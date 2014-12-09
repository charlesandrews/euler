package me.charlesandrews.euler.problem7;

import me.charlesandrews.euler.utils.Primes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Charles on 9/9/14.
 */
public class PrimeCalculator
{

    private static final Logger LOGGER = LoggerFactory.getLogger(PrimeCalculator.class);

    public static void main(String[] args)
    {
        int primeCount = 0;
        int current = 0;

        while (primeCount <= 10001)
        {
            if (Primes.isPrime(current))
            {
                primeCount++;
                LOGGER.info("The {} index prime is {}", primeCount, current);
            }
            current++;
        }
    }

}
