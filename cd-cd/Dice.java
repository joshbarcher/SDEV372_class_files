package objects;

import java.util.Random;

public class Dice
{
    private Random random;
    private int sides;
    private String color;

    public Dice(int sides, String color) {
        this.sides = sides;
        this.color = color;
        random = new Random();
    }

    public int getSides() {
        return sides;
    }
    public String getColor() {
        return color;
    }

    public int roll()
    {
        return random.nextInt(sides) + 1;
    }

    public int[] rollMany(int times)
    {
        int[] rollsHistory = new int[times];
        for (int i = 1; i <= times; i++)
        {
            rollsHistory[i] = roll();
        }
        return rollsHistory;
    }

    @Override
    public String toString()
    {
        return "A " + sides + " sided die";
    }
}

