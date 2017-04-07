
/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal implements Rank
{
    private String attackName;
    private int attackPower;
    private static double rank = 1;

    public Normal(String name, int power)
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