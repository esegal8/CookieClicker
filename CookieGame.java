import java.util.*;
import javax.swing.*;
import java.applet.Applet;
public class CookieGame
{
    private int numCookies;
    private String bakeryName="Electro Sloth";
    //do stuff
    public int getNumCookies()
    {
        return numCookies;
    }
    public void addCookies(int add)
    {
        numCookies+=add;
    }
    public void setName(String name)
    {
        bakeryName=name;
    }
    public String getName()
    {
        return bakeryName;
    }
    public void subtractCookies(int subtract)
    {
        if (numCookies>subtract)
            numCookies-=subtract;
    }
    public void main()
    {
        
    }
}