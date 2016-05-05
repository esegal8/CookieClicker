public abstract class Building extends CookieGame
{
    private int gain;
    private int number;
    private double multiplier;
    public Building(int g, double m)
    {
        gain = g;
        multiplier = m;
        number = 0;
    }
    public void buy()
    {
        number++;
    }
    public int cookies()
    {
        
    }
}