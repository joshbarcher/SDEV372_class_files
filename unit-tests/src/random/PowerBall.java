package random;

import java.util.Arrays;
import java.util.Random;

public class PowerBall
{
    private static Random random = new Random();
    private int[] numbers;

    public PowerBall()
    {
        numbers = new int[6];

        for (int i = 0; i < 5; i++)
        {
            numbers[i] = generate(1, 69);
        }
        numbers[5] = generate(1, 26);
    }

    public int[] getNumbers()
    {
        return Arrays.copyOf(numbers, 6);
    }

    private int generate(int low, int high)
    {
        return random.nextInt(high - low + 1) + low;
    }
}

