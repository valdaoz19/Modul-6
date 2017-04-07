
/**
 * Write a description of class Damager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Damager implements Rank
{
    // instance variables - replace the example below with your own
    
    private String attackName;
    private int attackPower;
    private static double rank = 1.25;

    public Damager(String name, int power)
    {
        this.attackName = name;
        this.attackPower = power;
    }
   
    public void setAttackName(String name)
    {
        // put your code here
        attackName = name;
    }
    
    public String getAttackerName()
    {
        return attackName;
    }
    
    public void setAttackPower(int power)
    {   
        attackPower = power;
    }
    
    public int getAttackPower()
    {
        return attackPower;
    }
    
    public double getRank()
    {
        return rank;
    }    
}
