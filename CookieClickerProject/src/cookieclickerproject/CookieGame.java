package cookieclickerproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esegal8
 */
import java.util.*;
public class CookieGame extends CookieClickerProject
{
    private final String bakeryName;
    private double numCookies;
    private double totalCookies;
    public CookieGame()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the name of your bakery: ");
        bakeryName= sc.nextLine();
        numCookies=0.0;
        totalCookies=0.0;
    }
    public void mainRunner() //main method, starts the game
    {
        
    }
    public double getNumCookies()
    {
        return numCookies;
    }
    public double getTotalCookies()
    {
        return totalCookies;
    }
    public void subtractCookies(double cost)
    {
        numCookies= numCookies-cost;
    }
    public void addCookies(double cost)
    {
        numCookies= numCookies+cost;
        totalCookies=totalCookies+cost;
    }
    public String getBakeryName(){ //This is a temporary test method
        return bakeryName;
    }
    public String toString(){ //This is a temporary test method
        return ("\n\n(づ｡◕‿‿◕｡)づ :･ﾟ✧Welcome to your Bakery✧ﾟ･: *ヽ(◕ヮ◕ヽ)\n*  *  *  *  *  *  *  *  *  *  *  \n{[ "
                +bakeryName+"'s Bakery ]}\nNumber of Cookies: "+numCookies+"\nTotal Cookies Earned: "
                +totalCookies);
    }
}
