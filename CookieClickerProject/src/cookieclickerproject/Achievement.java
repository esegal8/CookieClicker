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
public class Achievement {
    private String name;
    private boolean achieveGot=false;
    public Achievement(String name)
    {
        this.name=name;
    }
    public void setBool(boolean set)
    {
        achieveGot=set;
    }
    public Boolean getBool()
    {
            return achieveGot;
    }
}
