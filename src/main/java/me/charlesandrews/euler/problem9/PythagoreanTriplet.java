package me.charlesandrews.euler.problem9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Charles on 12/8/14.
 */
public class PythagoreanTriplet
{

    private static final Logger LOGGER = LoggerFactory.getLogger(PythagoreanTriplet.class);

    public boolean isPythagoreanTriple(int a, int b, int c)
    {
        if (a * a + b * b == c * c)
        {
            return true;
        }
        return false;
    }

    public void generateTriples(int sumValue)
    {
        int a = 1;

        while (a < sumValue / 3)
        {
            int b = a + 1;
            int c = sumValue;
            while (b < c)
            {
                c = sumValue - (a + b);
                if (isPythagoreanTriple(a, b, c))
                {
                    LOGGER.info("{},{},{} is a Pythagorean Triple", a,b,c);
                }
                b++;
            }
            a++;
        }
    }

    public static void main(String[] args)
    {
        PythagoreanTriplet pt = new PythagoreanTriplet();
        pt.generateTriples(1000);
    }


}
