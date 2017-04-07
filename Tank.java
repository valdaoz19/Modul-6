
/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank implements Rank
{
    private String attackName;
    private int attackPower;
    private static double rank = 0.8;

    public Tank(String name, int power)
    {
       this.attackName = name;
       this.attackPower = power;
    }
   
    public void setAttackName(String name)
    {
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
