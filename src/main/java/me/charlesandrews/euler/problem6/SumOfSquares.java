package me.charlesandrews.euler.problem6;

/**
 * Created by Charles on 9/9/14.
 */
public class SumOfSquares
{

    public long sumOfSquares(int target)
    {
        long value = 0;

        for (int i=1;i<=target;i++)
        {
            value += i*i;
        }
        return value;

    }

    public long squareOfSums(int target)
    {
        long value = 0;

        for (int i=1;i<=target;i++)
        {
            value += i;
        }
        return value*value;
    }

    public static void main(String[] args)
    {
        SumOfSquares sos = new SumOfSquares();
        System.out.println(sos.squareOfSums(100) - sos.sumOfSquares(100));
    }


}
