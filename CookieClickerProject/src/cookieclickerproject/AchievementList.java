/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookieclickerproject;
import java.util.*;
/**
 *
 * @author esegal8
 */
public class AchievementList {
    private ArrayList<Achievement> pie = new ArrayList<Achievement>();
    public AchievementList()
    {
        pie.add(new Achievement("Cookie Rookie"));
        pie.add(new Achievement("Cookie Enthusiast"));
        pie.add(new Achievement("You did something wrong"));
        pie.add(new Achievement("Bob the Builder"));
        pie.add(new Achievement("Speedy"));
        pie.add(new Achievement("Carpal Tunnel"));
        pie.add(new Achievement("Outdated Internet Joke"));
        pie.add(new Achievement("Upgraded"));
        pie.add(new Achievement("Boosted"));
        pie.add(new Achievement("Do you even Lift?"));
        pie.add(new Achievement("Dizzy"));
        pie.add(new Achievement("Stay Green"));
        pie.add(new Achievement("Ketchup with that?"));
        pie.add(new Achievement("Did you say Doge Coin Miners?"));
        pie.add(new Achievement("Filthy Rich"));
        pie.add(new Achievement("My Brain Hurts"));
        pie.add(new Achievement("The Cookie Clicker"));
        pie.add(new Achievement("Idle M@ster"));
        pie.add(new Achievement("Addicted"));
    }
    public void CheckA1(CookieGame hi)
    {
        if ((hi.getTotalCookies()>=100) && !(pie.get(0).getBool()))
            pie.get(0).setBool(true);
    }
    public void CheckA2(CookieGame hi)
    {
        if ((hi.getTotalCookies()>=10000) && !(pie.get(1).getBool()))
            pie.get(1
            ).setBool(true);
    }
    public void CheckA3(CookieGame hi)
    {
        if ((hi.getBakeryName().equals("Elliot")) && !(pie.get(2).getBool()))
            pie.get(2).setBool(true);
    }
    public void CheckA4(CookieGame hi)
    {
        if ((Building.getTotalBuildings()>=100) && !(pie.get(3).getBool()))
            pie.get(3).setBool(true);
    }
    public void CheckA5(CookieGame hi)
    {
        if ((hi.getClicksPerSecond()>=10) && !(pie.get(4).getBool()))
            pie.get(4).setBool(true);
    }
    public void CheckA6(CookieGame hi)
    {
        if ((hi.getTotalClicks()>=5000) && !(pie.get(5).getBool()))
            pie.get(5).setBool(true);
    }
    public void CheckA7(CookieGame hi)
    {
        if ((hi.getTotalClicks()>=9001) && !(pie.get(6).getBool()))
            pie.get(6).setBool(true);
    }
    public void CheckA8(CookieGame hi)
    {
        if ((hi.getTotalUpgrades()>=1) && !(pie.get(7).getBool()))
            pie.get(7).setBool(true);
    }
    public void CheckA9(CookieGame hi)
    {
        if ((hi.getTotalUpgrades()>=3) && !(pie.get(8).getBool()))
            pie.get(8).setBool(true);
    }
    public void CheckA10(CookieGame hi)
    {
        if ((hi.getTotalUpgrades()>=10) && !(pie.get(9).getBool()))
            pie.get(9).setBool(true);
    }
    public void CheckA11(Building cookieLoop)
    {
        if ((cookieLoop.getNumBuildings()>=100) && !(pie.get(10).getBool()))
            pie.get(10).setBool(true);
    }
    public void CheckA12(Building cookieTree)//mine
    {
        if ((cookieTree.getNumBuildings()>=80) && !(pie.get(11).getBool()))
            pie.get(11).setBool(true);
    }
    public void CheckA13(Building hash)
    {
        if(hash.getNumBuildings()>=60 && !!(pie.get(12).getBool()))
            pie.get(12).setBool(true);
    }
    public void CheckA14(Building database)
    {
        if(database.getNumBuildings()>=40 && !!(pie.get(13).getBool()))
            pie.get(13).setBool(true); 
    }
    public void CheckA15(Building print)
    {
        if(print.getNumBuildings()>=20 && !!(pie.get(14).getBool()))
            pie.get(14).setBool(true);
    }
    public void CheckA16(Building complicated)
    {
        if(complicated.getNumBuildings()>=5 && !!(pie.get(15).getBool()))
            pie.get(15).setBool(true);
    }
    public void CheckA17(CookieGame hi)
    {
        if (hi.getCookiesClicked()>=10000 && !!(pie.get(16).getBool()))
            pie.get(16).setBool(true);
    }
    public void CheckA18(CookieGame hi)
    {
        if(hi.getCookiesBuilt()>=25000)
            pie.get(17).setBool(true);
    }
    public void CheckA19()
    {
        boolean check=true;
        for(int i=0;i<pie.size()-1;i++ )
        {
            if(i!=2)
                if (!pie.get(i).getBool())
                   check=false;
        }
        pie.get(18).setBool(check);
    }
}
