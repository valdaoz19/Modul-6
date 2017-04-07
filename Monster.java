
/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Entity
{
    public Monster(String name, int level)
    {
        super(name,level);
    }

    public void quote()
    {
        System.out.println("Evil Power");
    }
    
    public void fullHP()
    {   
        maxHP = (((level*level)/10)+5);
        strength = (((level*level)/10)+5)/2;
        health = maxHP;
        setPower();
        
    }
}