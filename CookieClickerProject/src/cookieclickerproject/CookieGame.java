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

import java.util.Scanner;
import java.awt.event.*;
import javax.swing.Timer;
public class CookieGame extends CookieClickerProject //implements ActionListener
{
    private String bakeryName;
    private String buyOrSell;
    private double numCookies;
    private double totalCookies;
   /* private static Building cookieLoop;
    private static Building cookieTree;
    private static Building hashCookie;
    private static Building cookieDatabase;
    private static Building cookie3DPrinter;
    private static Building pRCL;//PolymorphicRecursiveCookieLoop
  */  //private static Building godCookie;
    private int cps;
    private int totalClicks;
    private int upgradeCounter;
  //  private Timer time= new Timer(1000,this);
    private boolean first=true;
    private double cookiesClicked;
    private double cookiesBuilt;
    private Cookies pie;
    public CookieGame()
    {
        numCookies=0.0;
        totalCookies=0.0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the name of your bakery: ");
        bakeryName= sc.nextLine();
        System.out.println(toString());
        pie = new Cookies(this);
    }
 //   public void actionPerformed(ActionEvent ae)
//    {
        
 //   }
    
   // public void mainRunner() //main method, starts the game
   // {
        
    //        pie = new Cookies(this);
        
   // }
    public void setTotalCookies(double num)
    {
        totalCookies = num;
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
                +bakeryName+"'s Bakery ]}\nNumber of Cookies: "+((int)(numCookies))+"\nTotal Cookies Earned: "
                +totalCookies);
    }
    public int getClicksPerSecond()
    {
        return cps;
    }
    public int getTotalClicks()
    {
        return totalClicks; 
    }
    public int getTotalUpgrades()
    {
        return upgradeCounter;
    }
    public double getCookiesClicked()
    {
        return cookiesClicked;
    }
    public double getCookiesBuilt()
    {
        return cookiesBuilt;
    }
}

    

