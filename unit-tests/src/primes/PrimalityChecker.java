package primes;

public class PrimalityChecker
{
    public boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        else if (num > 2 && num % 2 == 0)
        {
            return false;
        }

        int largestDivisor = (int)Math.floor(Math.sqrt(num));
        for (int i = largestDivisor; i >= 2; i--)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        PrimalityChecker checker = new PrimalityChecker();
        for (int i = 0; i <= 100; i++)
        {
            System.out.println(i + ": " + checker.isPrime(i));
        }
    }
}

