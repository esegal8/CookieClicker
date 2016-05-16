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


public class CookieGame extends CookieClickerProject implements ActionListener
{
    private String bakeryName;
    private double numCookies;
    private double totalCookies;
    private int cps;
    private int totalClicks;
    private int upgradeCounter;
    private Timer time= new Timer(1000,this);
    private boolean first=true;
    private double cookiesClicked;
    private double cookiesBuilt;
    public CookieGame()
    {
        //Scanner sc= new Scanner(System.in);
       // System.out.println("Please enter the name of your bakery: ");
        //bakeryName= sc.nextLine();
        numCookies=0.0;
        totalCookies=0.0;
        time.start();
    }
    public void actionPerformed(ActionEvent ae)
    {
        mainRunner();
    }
    
    public void mainRunner() //main method, starts the game
    {
        if (first)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Please enter the name of your bakery: ");
            bakeryName= sc.nextLine();
            toString();
            first = false;
        }
        
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

    
}
