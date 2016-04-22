
/**
 * Write a description of class Achievements here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Achievement
{
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
