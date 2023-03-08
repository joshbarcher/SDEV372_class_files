package math;

public class MyMath
{
    public double divide(double num, double den)
    {
        if (den == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num / den;
    }

    public double add(double first, double second)
    {
        return first + second;
    }
}
