package me.charlesandrews.euler.problem2;

/**
 * Created by charles.andrews on 09/09/2014.
 */
public class FibonacciSum {

    protected int fib(int seq)
    {
        if (seq == 1) { return 1;}
        if (seq == 2) { return 2;}
        return fib(seq - 1) + fib(seq -2);
    }

    public int sumFibEven(int maximum)
    {
        int i = 1;
        int f;
        int sum = 0;
        while ((f = fib(i)) < maximum)
        {
            if (f % 2 == 0)
            {
                sum += f;
            }
            i++;
        }

        return sum;
    }

    public static void main(String args[])
    {
        FibonacciSum fs = new FibonacciSum();
        System.out.println(fs.sumFibEven(4000000));
    }
}
