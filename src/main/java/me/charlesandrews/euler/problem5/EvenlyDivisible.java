package me.charlesandrews.euler.problem5;

/**
 * Created by Charles on 9/9/14.
 */
public class EvenlyDivisible
{

    public boolean isEventlyDivisibleTo20(int value)
    {
        if (value % 2 != 0 || value % 3 != 0 || value % 4 != 0 || value % 5 != 0 || value % 6 != 0
                || value % 7 != 0 || value % 8 != 0 || value % 9 != 0 || value % 10 != 0 || value % 11 != 0
                || value % 12 != 0 || value % 13 != 0 || value % 14 != 0 || value % 15 != 0 || value % 16 != 0
                || value % 17 != 0 || value % 18 != 0 || value % 19 != 0 || value % 20 != 0)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        EvenlyDivisible ed = new EvenlyDivisible();
        int i = 1;
        while (!ed.isEventlyDivisibleTo20(i))
        {
            i++;
        }
        System.out.println(i);
    }
}
