package me.charlesandrews.euler.problem4;

/**
 * Created by charles.andrews on 09/09/2014.
 */
public class PalindromeNumbers {

    protected boolean isPalindrome(long value)
    {
        String stringValue = Long.toString(value);
        int i = 0;
        int j = stringValue.length() - 1;
        while (i<=j)
        {
            if (!(stringValue.charAt(i) == stringValue.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public long generateLargestPalindrome(int start)
    {
        int second = start;
        while (start > 0 && second > 0)
        {
            long value = (start * second);
            if (isPalindrome(value)) { return value; }
            second--;
            value = start * second;
            if (isPalindrome(value)) { return value; }
            start--;
        }

        return 0L;
    }

    public static void main(String [] args)
    {
        PalindromeNumbers pn = new PalindromeNumbers();
        System.out.println(pn.generateLargestPalindrome(999));
    }

}
