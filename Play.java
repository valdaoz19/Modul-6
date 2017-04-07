
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player;
    private Monster enemy;
    private Random rand;
    private int enemyCount;

    /**
     * Constructor for objects of class Play
     */
    private Play()
    {
        // initialise instance variables
        initialize();

        System.out.println("War start!" +
        "\nHero = " + player.getName() + ", level = " + player.getLevel() +
        "\nEnemy = " + enemy.getName() + ", level = " + player.getLevel());

       for (int i = 1; !player.isDead(); i++)
        {
           
            print(i);
            if(i%2 == 1){
                 attackTurn(player,enemy);
            }
            else{
                attackTurn(enemy,player);
            }
            // kode anda
           
            if (enemy.isDead())
            {
                System.out.println("Enemy died! Spawning new enemy!");
                this.enemyCount = this.enemyCount+1;
                initializeEnemy();
                player.levelup();
                // kode anda
                System.out.println("Player level up! Level = " + player.getLevel());
            }
    }

    System.out.println("Hero mati pada level " + player.getLevel());
   }
 
    private void initialize(){
        rand = new Random();
        player = new Hero("yunus",1);
        player.setRank(setRank("Cidori", 19));
        player.setWeapon("Katana", 50);
        player.setArmor("Dragon Armor", 50);
        enemyCount = 1;
        
        initializeEnemy();
    }
        
    private void initializeEnemy(){
        enemy = new Monster("Randy",enemyCount);
        // berikut adalah code untuk versi dengan kekuata random yang tidak dapat di prediksi
        //enemy.setRank(setRank("Saringan", rand.nextInt((100 - 50) + 1) + 50));
        //enemy.setWeapon("Mata", rand.nextInt((25 - 5) + 1)+5);
       // enemy.setArmor("Scale", rand.nextInt((25 - 5) + 1)+5);
        // code untuk hasil yang dapat di prediksi
        enemy.setRank(setRank("Saringan",47));
        enemy.setWeapon("Mata", 10);
        enemy.setArmor("Scale", 10);
        
    }
    
    private void print(int i){
        System.out.println("\nRound = " + i +
        "\nKill count = " + (enemyCount - 1) +
        "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());
        // kode anda
        if(i%2 == 1){
            player.quote();
        }
        else{
            enemy.quote();
        }
    }
    
    private Rank setRank(String name, int power){
        Rank temp = null;
        if(player.getLevel()%3 == 1){
            Normal normal1 = new Normal(name,power);
            temp = normal1;
        }
        
        else if(player.getLevel()%3 == 2){
             Tank tank1 = new Tank(name,power);
             temp = tank1;
        }
        else {
            Damager damager1 = new Damager(name,power);
            temp = damager1;
        }
        return temp;
    }
    
    private void attackTurn(Entity attacker, Entity defender){
        int damage = (int)attacker.getDamage(defender.getDefense(),defender.getRank().getRank());
        System.out.println("damage: "+damage);
        defender.setHP(damage); 
       
    }
    
    public static void main(String[] args){
        Play demo1 = new Play();
    }
   
}
