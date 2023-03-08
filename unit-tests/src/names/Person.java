package names;

public class Person
{
    private String title;
    private String first;
    private String last;
    private char middle;

    public Person(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

    public String getTitle()
    {
        return title;
    }

    public String getFirst()
    {
        return first;
    }

    public String getLast()
    {
        return last;
    }

    public char getMiddle()
    {
        return middle;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setFirst(String first)
    {
        this.first = first;
    }

    public void setLast(String last)
    {
        this.last = last;
    }

    public void setMiddle(char middle)
    {
        this.middle = middle;
    }

    @Override
    public String toString()
    {
        return title + " " + first + " " + middle + ". " + last;
    }
}
