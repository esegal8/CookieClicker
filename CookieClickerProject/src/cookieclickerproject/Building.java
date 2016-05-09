/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookieclickerproject;

/**
 *
 * @author esegal8
 */
public class Building {
    private String name;
    private int gain;//how many cookies it adds
    private int number;//how many buildings made
    private double multiplier=1.0;//upgrades change this number
    private int cost;//how much one building costs
    private int delay;//how long it takes to gain once
    public Building(String name, int gain,int cost,int delay)
    {
        //delay should be in milliseconds so 1 sec=1000 millisec
        this.name=name;
        this.gain=gain;
        this.cost=cost;
        this.delay=delay;

    }
    
    public void buy(CookieGame game)
    {
        if (game.getNumCookies()>cost)
        {
            game.subtractCookies(cost);
            number++;
            cost*=1.15;
        }
    }
    
    public void sell(CookieGame game)
    {
        if (number>0)
        {
            game.addCookies(cost);
            number--;
            cost/=1.15;
        }
    }
    
    public double cookieGain(CookieGame game)
    {
        return gain*number*multiplier/delay;
    }
}