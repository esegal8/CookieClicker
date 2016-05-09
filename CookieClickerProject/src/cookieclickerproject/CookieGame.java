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
    
    public CookieGame()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the name of your bakery: ");
        bakeryName= sc.next();
    }
    public void goGo() 
    {
        
    }
}
