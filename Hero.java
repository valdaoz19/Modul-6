
/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Entity
{
    public Hero(String name, int level)
    {
        super(name,level);
    }

    public void quote()
    {
        System.out.println("For the sake of Justice");
    }
    
    public void fullHP()
    {
        maxHP = ((15*level)+5)/4;
        strength = ((15*level)+5)/8;
        health = maxHP;
        setPower();
    }
}
