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
public class Building extends CookieGame { 
    private String name;
    private double gain;//how many cookies it adds
    private int number;//how many buildings made
    private double multiplier=1.0;//upgrades change this number
    private double cost;//how much one building costs
    private double delay;//how long it takes to gain once
    private static int totalBuilt=0;
    public Building(String name, double gain,double cost,double delay)
    {
        //delay should be in milliseconds so 1 sec=1000 millisec
        this.name=name;
        this.gain=gain;
        this.cost=cost;
        this.delay=delay;

    }
    
    public void buy(Building build)
    {
        if (getNumCookies()>cost)
        {
            subtractCookies(cost);
            number++;
            cost*=1.15;
            totalBuilt++;
        }
        
    }
    
    public void sell(Building build)
    {
        if (number>0)
        {
            addCookies(cost/2);
            number--;
            cost/=1.15;
        }
    }
    
    public double cookieGain()
    {
        return gain*number*multiplier/delay;
    }

    public static int getTotalBuildings()
    {
        return totalBuilt;
    }
    
    public void changeMultiplier(double d)
    {
        multiplier*=d;

    }
    public int getNumBuildings()
    {
        return number;
    }
}
