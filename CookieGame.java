import java.util.*;
import javax.swing.*;
import java.applet.Applet;
public class CookieGame extends JApplet
{
    private int numCookies;
    //do stuff
    public int getNumCookies()
    {
        return numCookies;
    }
    public void addCookies()
    {
        numCookies++;
    }
}