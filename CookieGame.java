import java.util.*;
import javax.swing.*;
import java.applet.Applet;
public class CookieGame extends JApplet
{
    private int numCookies;
    private String bakeryName="Electro Sloth";
    //do stuff
    public int getNumCookies()
    {
        return numCookies;
    }
    public void addCookies()
    {
        numCookies++;
    }
    public void setName(String name)
    {
        bakeryName=name;
    }
    public String getName()
    {
        return bakeryName;
    }
}