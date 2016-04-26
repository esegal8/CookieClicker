public class Building
{
    private String name;
    private int gain;//how many cookies it adds
    private int number;//how many buildings made
    private double multiplier;//What does this do elliot?
    private int cost;//how much one building costs
    private int delay;//how long it takes to gain once
    public Building(String name, int gain,double multiplier,int cost,int delay)
    {
        //delay should be in miiliseconds
        this.name=name;
        this.gain=gain;
        this.multiplier=multiplier;
        this.cost=cost;
        this.delay=delay;
    }
    public void buy(CookieGame game)
    {
        if (game.getNumCookies()>cost)
        {
            number++;
            cost*=1.1;
            delay*=.9;
        }
        gain*=number;
    }
    public void sell(CookieGame game)
    {
        if (number>0)
        {
            number--;
            cost/=1.1;
            delay/=.9;
        }
        gain*=number;
    }
}