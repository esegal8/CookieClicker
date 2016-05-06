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
public abstract class Achievement {
    private String name;
    private boolean achieveGot;
    public Achievement(String name)
    {
        this.name=name;
    }
    public boolean getAchieveGot()
    {
        return achieveGot;
    }
    abstract void achievementGot();
}
