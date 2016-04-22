public abstract class Building extends CookieGame
{
    private int gain;
    private int number;
    private double multiplier;
    private int cost;
    public Building()
    {
        
    }
    public void buy(CookieGame game)
    {
        if (game.getNumCookies()>cost)
        {
            number++;
            cost*=1.1;
        }
    }
    
}