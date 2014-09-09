package me.charlesandrews.euler.problem1;

public class MultipleCounter {

    public int countMultipleOf3And5(int exclusiveMaximum)
    {
        int sum = 0;

        for (int i=1;i<exclusiveMaximum;i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        MultipleCounter mc = new MultipleCounter();
        System.out.println(mc.countMultipleOf3And5(1000));
    }
}
