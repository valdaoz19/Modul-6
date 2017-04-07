
/**
 * Write a description of interface Wear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Wear
{
   
    public void setWeapon(String name, double dmg);
    
    public String getWeapon();
    
    public void setArmor(String name, double def);
    
    public String getArmor();
    
    public double getWeaponDmg();
  
    public double getArmorDef();
    
}
